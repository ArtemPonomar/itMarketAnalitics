package com.ponomar.itMarketAnalytics.repository;

import com.ponomar.itMarketAnalytics.entity.Survey;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface SurveyRepository extends CrudRepository<Survey, Long>, JpaSpecificationExecutor<Survey> {

}
