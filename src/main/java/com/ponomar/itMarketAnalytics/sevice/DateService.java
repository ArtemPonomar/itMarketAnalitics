package com.ponomar.itMarketAnalytics.sevice;

import com.ponomar.itMarketAnalytics.entity.Point;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class DateService {
    public static String dateToString(Date date){
        return new SimpleDateFormat("yyyy-MM-dd").format(date);
    }

    public static String[] stringToParts(String s){
        return s.split("[^\\d]");
    }

    public static String partsToString(String[] parts){
        return parts[0] + "-" + parts[1] + "-" + parts[2];
    }

    public static String transformDate(String date){
        String[] parts = stringToParts(date);
        if (parts[1].equals("06")){
            parts[1] = " Червень";
        } else {
            parts[1] = " Грудень";
        }

        return parts[0]+parts[1];
    }

    public static List<Point> transformDates(List<Point> points){
        for (Point p : points){
            p.setDate(DateService.transformDate(p.getDate()));
        }
        return points;
    }
}
