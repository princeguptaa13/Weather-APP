package com.example.Weather_app.Dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Forecastday {
    public String date ;
    public int date_epoch ;
    public Day day ;
    public Astro astro ;
    public ArrayList<Hour> hour ;
}
