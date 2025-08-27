package com.example.Weather_app.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Root {
    public Location location;
    public Current current;
    @JsonProperty("forecast")   
    public ForeCast foreCast;
}
