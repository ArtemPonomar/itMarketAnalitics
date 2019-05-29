package com.ponomar.itMarketAnalytics.repository;

import com.ponomar.itMarketAnalytics.entity.FormData;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface FormDataRepository extends CrudRepository<FormData, Long>, JpaSpecificationExecutor<FormData> {
}
