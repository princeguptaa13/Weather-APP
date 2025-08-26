package com.example.Weather_app.Service;

import com.example.Weather_app.Dto.Root;
import com.example.Weather_app.Dto.weatherResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class weatherService {

    @Value("${weather.api.key}")
    private String apiKey ;
    @Value("${weather.api.url}")
    private String apiUrl ;

    private RestTemplate restTemp = new RestTemplate();

    public String test(){
        return "Good" ;
    }
    public weatherResponse getData(String city){
        String url = apiUrl+"?key="+apiKey+"&q="+city;
        Root response =  restTemp.getForObject(url , Root.class);
        weatherResponse weatherResponse = new weatherResponse();

        weatherResponse.setCity(response.getLocation().name);
        weatherResponse.setRegion(response.getLocation().region);
        weatherResponse.setCountry(response.getLocation().country);
        String condition = response.getCurrent().getCondition().getText();
        weatherResponse.setTemperature(response.getCurrent().temp_c);
        weatherResponse.setCondition(condition);

        return weatherResponse;
    }


}
