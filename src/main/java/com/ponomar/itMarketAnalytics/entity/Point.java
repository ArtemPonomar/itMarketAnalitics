package com.ponomar.itMarketAnalytics.entity;

import java.util.Objects;

public class Point {
    private String date;
    private double averageSalary;
    private double totalSalary;
    private double surveysInDate;


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getAverageSalary() {
        return averageSalary;
    }

    public void setAverageSalary(double averageSalary) {
        this.averageSalary = averageSalary;
    }

    public double getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(double totalSalary) {
        this.totalSalary = totalSalary;
    }

    public double getSurveysInDate() {
        return surveysInDate;
    }

    public void setSurveysInDate(double surveysInDate) {
        this.surveysInDate = surveysInDate;
    }

    @Override
    public String toString() {
        return "\nPoint{" +
                "date='" + date + '\'' +
                ", averageSalary=" + averageSalary +
                ", totalSalary=" + totalSalary +
                ", surveysInDate=" + surveysInDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Objects.equals(date, point.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date);
    }
}
