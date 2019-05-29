package com.ponomar.itMarketAnalytics.sevice;

import com.ponomar.itMarketAnalytics.entity.FormData;
import com.ponomar.itMarketAnalytics.entity.Survey;
import com.ponomar.itMarketAnalytics.repository.FormDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.TreeSet;

@Service
public class FormDataService {

    @Autowired
    private FormDataRepository formDataRepository;

    @Autowired
    private SurveyService surveyService;

    public FormData getFormData(){
        if (formDataRepository.count() > 0){
            return getFormDataFromRepo();
        } else {
            updateFormData();
            return getFormDataFromRepo();
        }
    }

    private FormData getFormDataFromRepo(){
        return formDataRepository.findAll().iterator().next();
    }

    private void clearRepo(){
        formDataRepository.deleteAll();
    }

    public void updateFormData() {
        clearRepo();
        FormData formData = new FormData();

        Set<String> cities = new TreeSet<>();
        Set<String> educationLevels = new TreeSet<>();
        Set<String> englishLevels = new TreeSet<>();
        Set<String> genders = new TreeSet<>();
        Set<String> positions = new TreeSet<>();
        Set<String> programmingLanguages = new TreeSet<>();
        Set<String> specializations = new TreeSet<>();
        Set<String> subjectAreas = new TreeSet<>();
        Set<String> surveyTimes = new TreeSet<>();

        for (Survey survey : surveyService.getAllSurveys()) {
            cities.add(survey.getCity());
            educationLevels.add(survey.getEducation());
            englishLevels.add(survey.getEnglishLevel());
            genders.add(survey.getGender());
            for(String pos: survey.getPosition().split(" / ")){
                positions.add(pos);
            }
            programmingLanguages.add(survey.getProgrammingLanguage());
            programmingLanguages.remove("");
            specializations.add(survey.getSpecialization());
            specializations.remove("");
            for (String sa : survey.getSubjectArea().split(",")){
                subjectAreas.add(sa);
            }
            subjectAreas.remove("");
            subjectAreas.remove("na");
            surveyTimes.add(DateService.dateToString(survey.getSurveyDate()));
        }

        formData.setCities(cities);
        formData.setEducationLevels(educationLevels);
        formData.setEnglishLevels(englishLevels);
        formData.setGenders(genders);
        formData.setPositions(positions);
        formData.setProgrammingLanguages(programmingLanguages);
        formData.setSpecializations(specializations);
        formData.setSubjectAreas(subjectAreas);
        formData.setSurveyDates(surveyTimes);

        formDataRepository.save(formData);
    }


}

