package com.example.Weather_app.Dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class DayTemp {
    private LocalDate date ;
    private Double minTemp ;
    private double avgTemp ;
    private double maxTemp;
}
