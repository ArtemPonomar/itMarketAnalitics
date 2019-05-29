//package com.ponomar.itMarketAnalytics;
//
//import com.ponomar.itMarketAnalytics.sevice.FormDataService;
//import com.ponomar.itMarketAnalytics.sevice.MathService;
//import com.ponomar.itMarketAnalytics.sevice.SurveyService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.context.event.ApplicationReadyEvent;
//import org.springframework.context.event.EventListener;
//import org.springframework.stereotype.Component;
//
//@Component
//public class AppReadyListner {
//
//    @Autowired
//    private SurveyService surveyService;
//
//    @Autowired
//    private FormDataService formDataService;
//
//    @Autowired
//    private MathService mathService;
//
//
//    @EventListener(ApplicationReadyEvent.class)
//    private void init() {
////        formDataService.updateFormData();
//        System.out.println(formDataService.getFormData());
//
//    }
//}
