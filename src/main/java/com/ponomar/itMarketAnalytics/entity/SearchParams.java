package com.ponomar.itMarketAnalytics.entity;

public class SearchParams {
    private String city;
    private String position;
    private String englishLevel;
    private String language;
    private String specialization;
    private String educationLevel;
    private int minimalExperience;
    private int maximalExperience;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEnglishLevel() {
        return englishLevel;
    }

    public void setEnglishLevel(String englishLevel) {
        this.englishLevel = englishLevel;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public int getMinimalExperience() {
        return minimalExperience;
    }

    public void setMinimalExperience(int minimalExperience) {
        this.minimalExperience = minimalExperience;
    }

    public int getMaximalExperience() {
        return maximalExperience;
    }

    public void setMaximalExperience(int maximalExperience) {
        this.maximalExperience = maximalExperience;
    }

    @Override
    public String toString() {
        return "SearchParams{" +
                "city='" + city + '\'' +
                ", position='" + position + '\'' +
                ", englishLevel='" + englishLevel + '\'' +
                ", language='" + language + '\'' +
                ", specialization='" + specialization + '\'' +
                ", educationLevel='" + educationLevel + '\'' +
                ", minimalExperience=" + minimalExperience +
                ", maximalExperience=" + maximalExperience +
                '}';
    }
}
