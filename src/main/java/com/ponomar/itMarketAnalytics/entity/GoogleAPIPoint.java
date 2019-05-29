package com.ponomar.itMarketAnalytics.entity;

public class GoogleAPIPoint {
    private String date;
    private int averageSalary;
    private int surveyQuantity;

    public GoogleAPIPoint(Point point){
        date = point.getDate();
        averageSalary = (int)point.getAverageSalary();
        surveyQuantity = (int)point.getSurveysInDate();
    }

    public String getDate() {
        return date;
    }

    public int getAverageSalary() {
        return averageSalary;
    }

    public int getSurveyQuantity() {
        return surveyQuantity;
    }
}
