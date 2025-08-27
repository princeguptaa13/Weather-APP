package com.example.Weather_app.Service;

import com.example.Weather_app.Dto.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Service
public class weatherService {

    @Value("${weather.api.key}")
    private String apiKey ;
    @Value("${weather.api.url}")
    private String apiUrl ;
    @Value("${weather.forecastapi.url}")
    private String forecastapiUrl ;

    private RestTemplate restTemp = new RestTemplate();

    public String test(){
        return "Good" ;
    }
    public WeatherResponse getData(String city){
        String url = apiUrl+"?key="+apiKey+"&q="+city;
        Root response =  restTemp.getForObject(url , Root.class);
        WeatherResponse weatherResponse = new WeatherResponse();

        weatherResponse.setCity(response.getLocation().name);
        weatherResponse.setRegion(response.getLocation().region);
        weatherResponse.setCountry(response.getLocation().country);
        String condition = response.getCurrent().getCondition().getText();
        weatherResponse.setTemperature(response.getCurrent().temp_c);
        weatherResponse.setCondition(condition);
        return weatherResponse;
    }

public WeatherForecast getForeCast(String city, int days)
{
    WeatherForecast weatherForeCast=new WeatherForecast();
    WeatherResponse weatherResponse = getData(city);
    WeatherForecast response = new WeatherForecast();
    response.setWeatherResponse(weatherResponse);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    List<DayTemp> dayList = new ArrayList<>();
    String url = forecastapiUrl +"?key="+apiKey+"&q="+city+"&days="+days;
    Root apiResponse = restTemp.getForObject(url, Root.class);
    ForeCast forecast = apiResponse.getForeCast();
    ArrayList<Forecastday> forecastday = forecast.getForecastday();
    for(Forecastday rs: forecastday)
    {
        DayTemp d=new DayTemp();
        LocalDate localDate = LocalDate.parse(rs.getDate(), formatter);
        d.setDate(localDate);
        d.setMinTemp(rs.getDay().mintemp_c);
        d.setAvgTemp(rs.getDay().avgtemp_c);
        d.setMaxTemp(rs.getDay().maxtemp_c);
        dayList.add(d);
    }

    response.setDayTemp(dayList);
    return response;

}


}
