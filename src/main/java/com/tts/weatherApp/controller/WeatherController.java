package com.tts.weatherApp.controller;

import com.tts.weatherApp.model.Request;
import com.tts.weatherApp.model.Response;

import com.tts.weatherApp.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@Controller
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping ("/")
    public String getIndex(Model model) {
//        Response response = weatherService.getForecast("43220");
//        model.addAttribute("data", response);
        model.addAttribute("request", new Request());
        return "index";
    }
    @PostMapping ("/")
    public String postIndex(Request request, Model model) {
        Response data = weatherService.getForecast(request.getZipCode());
        model.addAttribute("data", data);
        return "index";
    }





}
