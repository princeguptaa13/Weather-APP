package com.example.Weather_app.Dto;

import lombok.Data;

@Data
public class Day {
    public double maxtemp_c ;
    public double maxtemp_f ;
    public double mintemp_c ;
    public double mintemp_f ;
    public double avgtemp_c ;
    public double avgtemp_f ;
    public double maxwind_mph ;
    public double maxwind_kph ;
    public double totalprecip_mm ;
    public double totalprecip_in ;
    public int totalsnow_cm ;
    public int avgvis_miles ;
    public int avghumidity ;
    public Condition condition ;
    public double uv ;
}
