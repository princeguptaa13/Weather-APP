package com.example.Weather_app.Dto;

import lombok.Data;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class ForeCast {

    public ArrayList<Forecastday> forecastday ;

    public ArrayList<Forecastday> getForecastday() {
        return forecastday;
    }

    public void setForecastday(ArrayList<Forecastday> forecastday) {
        this.forecastday = forecastday;
    }
}

