package com.ponomar.itMarketAnalytics.sevice;

import com.ponomar.itMarketAnalytics.entity.Point;
import com.ponomar.itMarketAnalytics.entity.SearchParams;
import com.ponomar.itMarketAnalytics.entity.Survey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class GraphBuilderService {

    @Autowired
    private SurveyService surveyService;

    @Autowired
    private MathService mathService;

    @Autowired
    private DateService dateService;

    public List<Point> getPoints(SearchParams searchParams) {
        List<Survey> surveys = surveyService.getSurveysWithParams(searchParams);
        Map<String, Point> pointsMap = new HashMap<>();
        for (Survey survey : surveys) {
            String currentDate = dateService.dateToString(survey.getSurveyDate());
            if (pointsMap.containsKey(currentDate)) {
                Point currentPoint = pointsMap.get(currentDate);
                currentPoint.setTotalSalary(currentPoint.getTotalSalary() + survey.getSalary());
                currentPoint.setSurveysInDate(currentPoint.getSurveysInDate() + 1);
                pointsMap.put(currentDate, currentPoint);
            } else {
                Point newPoint = new Point();
                newPoint.setDate(currentDate);
                newPoint.setTotalSalary(survey.getSalary());
                pointsMap.put(currentDate, newPoint);
            }
        }
        List<Point> result = new ArrayList<>();
        for (Point point : pointsMap.values()) {
            point.setAverageSalary(mathService.getAverage(point.getTotalSalary(), point.getSurveysInDate()));
            result.add(point);
        }
        result.sort(Comparator.comparing(Point::getDate));
        if (result.size() < 16) return null;

        dateService.transformDates(result);

        return result;
    }
}

