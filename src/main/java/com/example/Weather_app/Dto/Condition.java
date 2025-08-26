package com.example.Weather_app.Dto;

import lombok.Data;

@Data
public class Condition {
    public String text;
    public String icon;
    public int code;
}
