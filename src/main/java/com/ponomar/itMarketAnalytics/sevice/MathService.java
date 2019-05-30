package com.ponomar.itMarketAnalytics.sevice;

import org.springframework.stereotype.Service;

@Service
public class MathService {

    public double getAverage(double sum, double quantity){
        if ((int)quantity == 0) return 0;
        else return sum/quantity;
    }
}
