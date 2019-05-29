package com.ponomar.itMarketAnalytics.sevice;

import com.ponomar.itMarketAnalytics.entity.Point;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MathService {

    public double getAverage(double sum, double quantity){
        if ((int)quantity == 0) return 0;
        else return sum/quantity;
    }

    public String transformPointsToRawData(List<Point> points){
        String x = "x = [";
        for (int i = 1; i < points.size()+1; i++){
            x += i + " ";
        }
        x+=";\n2 ";
        for (int i = 1; i < points.size(); i++) {
            if (points.get(i).getAverageSalary() >= points.get(i - 1).getAverageSalary()) {
                x += "2 ";
            } else {
                x += "1 ";
            }
        }
        x += "];\n";
        String y = "y = [";
        for (Point point : points){
            y += (int)point.getAverageSalary() + " ";
        }
        y += "];\n\n";

        return x + y;
    }
}
