package com.ponomar.itMarketAnalytics.entity;

import javax.persistence.*;
import java.util.Set;
import java.util.TreeSet;

@Entity
public class FormData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "cities", joinColumns = @JoinColumn(name = "formData_id"))
    @Column(name = "city")
    private Set<String> cities;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "educationLevels", joinColumns = @JoinColumn(name = "formData_id"))
    @Column(name = "educationLevel")
    private Set<String> educationLevels;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "englishLevels", joinColumns = @JoinColumn(name = "formData_id"))
    @Column(name = "englishLevel")
    private Set<String> englishLevels;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "genders", joinColumns = @JoinColumn(name = "formData_id"))
    @Column(name = "gender")
    private Set<String> genders;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "positions", joinColumns = @JoinColumn(name = "formData_id"))
    @Column(name = "position")
    private Set<String> positions;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "programmingLanguages", joinColumns = @JoinColumn(name = "formData_id"))
    @Column(name = "programmingLanguage")
    private Set<String> programmingLanguages;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "specializations", joinColumns = @JoinColumn(name = "formData_id"))
    @Column(name = "specialization")
    private Set<String> specializations;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "subjectAreas", joinColumns = @JoinColumn(name = "formData_id"))
    @Column(name = "subjectArea")
    private Set<String> subjectAreas;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "surveyDates", joinColumns = @JoinColumn(name = "formData_id"))
    @Column(name = "surveyDate")
    private Set<String> surveyDates;


    @Override
    public String toString() {
        return "FormData{" +
                "\ncities=" + cities +
                ", \neducationLevels=" + educationLevels +
                ", \nenglishLevels=" + englishLevels +
                ", \npositions=" + positions +
                ", \nprogrammingLanguages=" + programmingLanguages +
                ", \nspecializations=" + specializations +
                ", \nsurveyDates=" + surveyDates +
                '}';
    }

    public Set<String> getCities() {
        return new TreeSet<>(cities);
    }

    public void setCities(Set<String> cities) {
        this.cities = cities;
    }

    public Set<String> getEducationLevels() {
        return new TreeSet<>(educationLevels);
    }

    public void setEducationLevels(Set<String> educationLevels) {
        this.educationLevels = educationLevels;
    }

    public Set<String> getEnglishLevels() {
        return new TreeSet<>(englishLevels);
    }

    public void setEnglishLevels(Set<String> englishLevels) {
        this.englishLevels = englishLevels;
    }

    public Set<String> getGenders() {
        return new TreeSet<>(genders);
    }

    public void setGenders(Set<String> genders) {
        this.genders = genders;
    }

    public Set<String> getPositions() {
        return new TreeSet<>(positions);
    }

    public void setPositions(Set<String> positions) {
        this.positions = positions;
    }

    public Set<String> getProgrammingLanguages() {
        return new TreeSet<>(programmingLanguages);
    }

    public void setProgrammingLanguages(Set<String> programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }

    public Set<String> getSpecializations() {
        return new TreeSet<>(specializations);
    }

    public void setSpecializations(Set<String> specializations) {
        this.specializations = specializations;
    }

    public Set<String> getSubjectAreas() {
        return new TreeSet<>(subjectAreas);
    }

    public void setSubjectAreas(Set<String> subjectAreas) {
        this.subjectAreas = subjectAreas;
    }

    public Set<String> getSurveyDates() {
        return new TreeSet<>(surveyDates);
    }

    public void setSurveyDates(Set<String> surveyDates) {
        this.surveyDates = surveyDates;
    }
}
