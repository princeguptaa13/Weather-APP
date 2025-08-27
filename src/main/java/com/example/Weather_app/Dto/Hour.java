package com.example.Weather_app.Dto;

import lombok.Data;

@Data
public class Hour {
    public int time_epoch ;
    public String time ;
    public double temp_c ;
    public double temp_f ;
    public int is_day ;
    public Condition condition ;
    public double wind_mph ;
    public double wind_kph ;
    public int wind_degree ;

}



