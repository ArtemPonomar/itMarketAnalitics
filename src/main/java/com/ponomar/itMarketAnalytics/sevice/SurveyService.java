package com.ponomar.itMarketAnalytics.sevice;

import com.ponomar.itMarketAnalytics.entity.FormData;
import com.ponomar.itMarketAnalytics.entity.SearchParams;
import com.ponomar.itMarketAnalytics.entity.Survey;
import com.ponomar.itMarketAnalytics.repository.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class SurveyService {
    @Autowired
    private SurveyRepository surveyRepository;

    public Iterable<Survey> getAllSurveys() {
        return surveyRepository.findAll();
    }

    public List<Survey> getSurveysWithParams(SearchParams searchParams){
        List<Survey> result = surveyRepository.findAll(SurveySpecifications.
                withCity(searchParams.getCity()).and(SurveySpecifications.
                withEducation(searchParams.getEducationLevel()).and(SurveySpecifications.
                withEnglishLevel(searchParams.getEnglishLevel()).and(SurveySpecifications.
                withExperienceLessThan(searchParams.getMaximalExperience()).and(SurveySpecifications.
                withExperienceMoreThan(searchParams.getMinimalExperience()).and(SurveySpecifications.
                withPosition(searchParams.getPosition()).and(SurveySpecifications.
                withProgrammingLanguage(searchParams.getLanguage()).and(SurveySpecifications.
                withSpecialization(searchParams.getSpecialization())))))))));
        result.sort(Comparator.comparing(Survey::getSurveyDate));
        return result;
    }
}
