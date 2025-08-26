package com.example.Weather_app.Dto;

import lombok.Data;

@Data
public class Root {
    public Location location;
    public Current current;
}
