package com.ponomar.itMarketAnalytics.sevice;

import com.ponomar.itMarketAnalytics.entity.Point;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class DateService {
    public String dateToString(Date date){
        return new SimpleDateFormat("yyyy-MM-dd").format(date);
    }

    public String transformDate(String date){
        String[] parts = date.split("[^\\d]");
        if (parts[1].equals("06")){
            parts[1] = " Червень";
        } else {
            parts[1] = " Грудень";
        }

        return parts[0]+parts[1];
    }

    public List<Point> transformDates(List<Point> points){
        for (Point p : points){
            p.setDate(transformDate(p.getDate()));
        }
        return points;
    }
}
