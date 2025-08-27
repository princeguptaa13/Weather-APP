package com.example.Weather_app.Dto;

import lombok.Data;

import java.util.List;

@Data
public class WeatherForecast {

    private WeatherResponse weatherResponse;

    private List<DayTemp> dayTemp ;

}
