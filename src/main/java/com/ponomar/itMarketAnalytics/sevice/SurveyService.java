package com.ponomar.itMarketAnalytics.sevice;

import com.ponomar.itMarketAnalytics.entity.SearchParams;
import com.ponomar.itMarketAnalytics.entity.Survey;
import com.ponomar.itMarketAnalytics.repository.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class SurveyService {
    @Autowired
    private SurveyRepository surveyRepository;

    @Autowired
    private SurveySpecifications surveySpecifications;

    public Iterable<Survey> getAllSurveys() {
        return surveyRepository.findAll();
    }

    public List<Survey> getSurveysWithParams(SearchParams searchParams){
        List<Survey> result = surveyRepository.findAll(surveySpecifications.
                withCity(searchParams.getCity()).and(surveySpecifications.
                withEducation(searchParams.getEducationLevel()).and(surveySpecifications.
                withEnglishLevel(searchParams.getEnglishLevel()).and(surveySpecifications.
                withExperienceLessThan(searchParams.getMaximalExperience()).and(surveySpecifications.
                withExperienceMoreThan(searchParams.getMinimalExperience()).and(surveySpecifications.
                withPosition(searchParams.getPosition()).and(surveySpecifications.
                withProgrammingLanguage(searchParams.getLanguage()).and(surveySpecifications.
                withSpecialization(searchParams.getSpecialization())))))))));
        result.sort(Comparator.comparing(Survey::getSurveyDate));
        return result;
    }
}
