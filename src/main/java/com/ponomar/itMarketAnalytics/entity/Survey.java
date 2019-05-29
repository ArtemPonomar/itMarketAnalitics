package com.ponomar.itMarketAnalytics.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Survey {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String position;

    private String programmingLanguage;

    private String specialization;

    private float experience;

    private float salary;

    private String city;

    private String gender;

    private String education;

    private String stillStudent;

    private String englishLevel;

    private String subjectArea;

    private Date surveyDate;

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getStillStudent() {
        return stillStudent;
    }

    public Date getSurveyDate() {
        return surveyDate;
    }

    public void setSurveyDate(Date surveyDate) {
        this.surveyDate = surveyDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String isStillStudent() {
        return stillStudent;
    }

    public void setStillStudent(String stillStudent) {
        this.stillStudent = stillStudent;
    }

    public String getEnglishLevel() {
        return englishLevel;
    }

    public void setEnglishLevel(String englishLevel) {
        this.englishLevel = englishLevel;
    }

    public String getSubjectArea() {
        return subjectArea;
    }

    public void setSubjectArea(String subjectArea) {
        this.subjectArea = subjectArea;
    }

    @Override
    public String toString() {
        return "Survey{" +
                "id=" + id +
                ",\tposition='" + position + '\'' +
                ",\tprogrammingLanguage='" + programmingLanguage + '\'' +
                ",\tspecialization='" + specialization + '\'' +
                ",\texperience=" + experience +
                ",\tsalary=" + salary +
                ",\tcity='" + city + '\'' +
                ",\tgender='" + gender + '\'' +
                ",\teducation='" + education + '\'' +
                ",\tstillStudent='" + stillStudent + '\'' +
                ",\tenglishLevel='" + englishLevel + '\'' +
                ",\tsubjectArea='" + subjectArea + '\'' +
                '}';
    }
}
