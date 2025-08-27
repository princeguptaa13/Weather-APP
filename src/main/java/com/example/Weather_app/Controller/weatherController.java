package com.example.Weather_app.Controller;

import com.example.Weather_app.Dto.WeatherForecast;
import com.example.Weather_app.Dto.WeatherResponse;
import com.example.Weather_app.Service.weatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")
@CrossOrigin
public class weatherController {

    @Autowired
    private weatherService weatherService;

    @GetMapping("/my/{city}")
    public WeatherResponse getWeatherData(@PathVariable String city){
               return weatherService.getData(city);
    }
    @GetMapping("/forecast")
    public WeatherForecast getForeCast(@RequestParam String city , @RequestParam int days){
        return weatherService.getForeCast(city, days);
    }
}
