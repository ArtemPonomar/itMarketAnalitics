package com.ponomar.itMarketAnalytics.sevice;

import com.ponomar.itMarketAnalytics.entity.GoogleAPIPoint;
import com.ponomar.itMarketAnalytics.entity.Point;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GoogleAPIService {
    public List<GoogleAPIPoint> toAPIPoints(List<Point> points){
        if (points == null) return null;
        List<GoogleAPIPoint> apiPoints = new ArrayList<>();
        for (Point p : points){
            apiPoints.add(new GoogleAPIPoint(p));
        }
        return apiPoints;
    }
}
