package com.ponomar.itMarketAnalytics.sevice;

import com.ponomar.itMarketAnalytics.entity.Survey;
import org.springframework.data.jpa.domain.Specification;

public class SurveySpecifications {

    public static Specification<Survey> withCity(String var) {
        return (root, cq, cb) -> cb.like(cb.lower(root.get("city")), "%" + var.toLowerCase() + "%");
    }

    public static Specification<Survey> withEducation(String var) {
        return (root, cq, cb) -> cb.like(cb.lower(root.get("education")), "%" + var.toLowerCase() + "%");
    }

    public static Specification<Survey> withEnglishLevel(String var) {
        return (root, cq, cb) -> cb.like(cb.lower(root.get("englishLevel")), "%" + var.toLowerCase() + "%");
    }

    public static Specification<Survey> withExperienceLessThan(int val) {
        return (root, cq, cb) -> cb.lessThanOrEqualTo(root.get("experience"), val);
    }

    public static Specification<Survey> withExperienceMoreThan(int val) {
        return (root, cq, cb) -> cb.greaterThanOrEqualTo(root.get("experience"), val);
    }

    public static Specification<Survey> withPosition(String var) {
            return (root, cq, cb) -> cb.like(root.get("position"), "%" + var + "%");
    }

    public static Specification<Survey> withProgrammingLanguage(String var) {
        if (var == ""){
            return (root, cq, cb) -> cb.like(root.get("programmingLanguage"), "%" + var + "%");
        } else {
            return (root, cq, cb) -> cb.like(cb.lower(root.get("programmingLanguage")), var.toLowerCase());
        }
    }

    public static Specification<Survey> withSpecialization(String var) {
        return (root, cq, cb) -> cb.like(cb.lower(root.get("specialization")), "%" + var.toLowerCase() + "%");
    }
}
