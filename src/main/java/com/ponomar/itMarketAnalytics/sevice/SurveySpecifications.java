package com.ponomar.itMarketAnalytics.sevice;

import com.ponomar.itMarketAnalytics.entity.Survey;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class SurveySpecifications {

    public Specification<Survey> withCity(String var) {
        return (root, cq, cb) -> cb.like(cb.lower(root.get("city")), "%" + var.toLowerCase() + "%");
    }

    public Specification<Survey> withEducation(String var) {
        return (root, cq, cb) -> cb.like(cb.lower(root.get("education")), "%" + var.toLowerCase() + "%");
    }

    public Specification<Survey> withEnglishLevel(String var) {
        return (root, cq, cb) -> cb.like(cb.lower(root.get("englishLevel")), "%" + var.toLowerCase() + "%");
    }

    public Specification<Survey> withExperienceLessThan(int val) {
        return (root, cq, cb) -> cb.lessThanOrEqualTo(root.get("experience"), val);
    }

    public Specification<Survey> withExperienceMoreThan(int val) {
        return (root, cq, cb) -> cb.greaterThanOrEqualTo(root.get("experience"), val);
    }

    public Specification<Survey> withPosition(String var) {
            return (root, cq, cb) -> cb.like(root.get("position"), "%" + var + "%");
    }

    public Specification<Survey> withProgrammingLanguage(String var) {
        if (var == ""){
            return (root, cq, cb) -> cb.like(root.get("programmingLanguage"), "%" + var + "%");
        } else {
            return (root, cq, cb) -> cb.like(cb.lower(root.get("programmingLanguage")), var.toLowerCase());
        }
    }

    public Specification<Survey> withSpecialization(String var) {
        return (root, cq, cb) -> cb.like(cb.lower(root.get("specialization")), "%" + var.toLowerCase() + "%");
    }
}
