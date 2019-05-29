package com.ponomar.itMarketAnalytics.controller;

import com.ponomar.itMarketAnalytics.entity.FormData;
import com.ponomar.itMarketAnalytics.entity.GoogleAPIPoint;
import com.ponomar.itMarketAnalytics.entity.Point;
import com.ponomar.itMarketAnalytics.entity.SearchParams;
import com.ponomar.itMarketAnalytics.sevice.FormDataService;
import com.ponomar.itMarketAnalytics.sevice.GoogleAPIService;
import com.ponomar.itMarketAnalytics.sevice.GraphBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SearchController {

    @Autowired
    private FormDataService formDataService;

    @Autowired
    private GraphBuilder graphBuilder;

    @Autowired
    private GoogleAPIService googleAPIService;

    @GetMapping
    public String index(Model model) {
        FormData formData = formDataService.getFormData();

        model.addAttribute("formData", formData);

        return "index";
    }

    @PostMapping
    public String index(@RequestParam(required = false) String city,
                        @RequestParam(required = false) String position,
                        @RequestParam(required = false) String language,
                        @RequestParam(required = false) String specialization,
                        @RequestParam(required = false) String englishLevel,
                        @RequestParam(required = false) String educationLevel,
                        @RequestParam(required = false) int minimalExperience,
                        @RequestParam(required = false) int maximalExperience,
                        Model model) {

        SearchParams searchParams = new SearchParams();
        searchParams.setCity(city);
        searchParams.setPosition(position);
        searchParams.setLanguage(language);
        searchParams.setSpecialization(specialization);
        searchParams.setEnglishLevel(englishLevel);
        searchParams.setEducationLevel(educationLevel);
        searchParams.setMinimalExperience(minimalExperience);
        searchParams.setMaximalExperience(maximalExperience);

        List<Point> points = graphBuilder.getPoints(searchParams);
        List<GoogleAPIPoint> apiPoints = googleAPIService.toAPIPoints(points);
        if (apiPoints == null) model.addAttribute("errorMessage", "Недостатньо даних для аналізу");


        model.addAttribute("points", apiPoints);
        model.addAttribute("formData", formDataService.getFormData());

        return "index";
    }
}
