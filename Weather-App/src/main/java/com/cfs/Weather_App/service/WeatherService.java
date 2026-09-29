package com.cfs.Weather_App.service;

import com.cfs.Weather_App.dto.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class WeatherService {

    @Value("${weather.api.key}")
    private String apiKey;

    @Value("${weather.api.url}")
    private String apiUrl;

    @Value("${weather.api.forecast.url}")
    private String apiForecastUrl;

    private final RestClient restClient = RestClient.create();

    public String test() {
        return "good";
    }

    public WeatherResponse getData(String city) {
        Root response = restClient.get()
                .uri(apiUrl + "?key=" + apiKey + "&q=" + city)
                .retrieve()
                .body(Root.class);
        return toWeatherResponse(response);
    }

    public WeatherForeCast getForecast(String city, int days) {
        Root apiResponse = restClient.get()
                .uri(apiForecastUrl + "?key=" + apiKey + "&q=" + city + "&days=" + days)
                .retrieve()
                .body(Root.class);

        WeatherForeCast result = new WeatherForeCast();
        result.setWeatherResponse(toWeatherResponse(apiResponse));

        List<DayTemp> dayList = new ArrayList<>();

        if (apiResponse != null
                && apiResponse.getForecast() != null
                && apiResponse.getForecast().getForecastday() != null) {

            for (Forecastday rs : apiResponse.getForecast().getForecastday()) {
                DayTemp d = new DayTemp();
                d.setDate(LocalDate.parse(rs.getDate()));
                if (rs.getDay() != null) {
                    d.setMinTemp(rs.getDay().mintemp_c);
                    d.setAvgTemp(rs.getDay().avgtemp_c);
                    d.setMaxTemp(rs.getDay().maxtemp_c);
                    if (rs.getDay().getCondition() != null) {
                        d.setCondition(rs.getDay().getCondition().getText());
                    }
                }
                dayList.add(d);
            }
        }

        result.setDayTemp(dayList);
        return result;
    }

    private WeatherResponse toWeatherResponse(Root root) {
        WeatherResponse weatherResponse = new WeatherResponse();
        if (root == null) return weatherResponse;

        if (root.getLocation() != null) {
            weatherResponse.setCity(root.getLocation().getName());
            weatherResponse.setRegion(root.getLocation().getRegion());
            weatherResponse.setCountry(root.getLocation().getCountry());
        }

        if (root.getCurrent() != null) {
            weatherResponse.setTemperature(root.getCurrent().getTemp_c());
            if (root.getCurrent().getCondition() != null) {
                weatherResponse.setCondition(root.getCurrent().getCondition().getText());
            }
        }

        return weatherResponse;
    }
}