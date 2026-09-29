package com.cfs.Weather_App.controller;

import com.cfs.Weather_App.dto.WeatherForeCast;
import com.cfs.Weather_App.dto.WeatherResponse;
import com.cfs.Weather_App.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")
@CrossOrigin(origins = "*")
public class Controller {

    @Autowired
    private WeatherService service;

    @GetMapping("/test")
    public String testWeather() {
        return service.test();
    }

    @GetMapping("/my/{city}")
    public WeatherResponse getWeatherData(@PathVariable String city) {
        return service.getData(city);
    }

    @GetMapping("/forecast")
    public WeatherForeCast getForecast(@RequestParam String city, @RequestParam int days) {
        return service.getForecast(city, days);
    }
}