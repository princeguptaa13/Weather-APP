package com.example.Weather_app.Controller;

import com.example.Weather_app.Dto.Root;
import com.example.Weather_app.Dto.weatherResponse;
import com.example.Weather_app.Service.weatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class weatherController {

    @Autowired
    private weatherService weatherService;

    @GetMapping("/my/{city}")
    private weatherResponse getWeatherData(@PathVariable String city){
               return weatherService.getData(city);
    }
}
