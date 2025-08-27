package com.example.Weather_app.Dto;

import lombok.Data;


@Data
public class WeatherResponse {

    private String city ;

    private String region ;

    private String condition ;

    private String country ;

    private double temperature ;

}
