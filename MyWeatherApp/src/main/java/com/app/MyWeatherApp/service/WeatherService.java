package com.app.MyWeatherApp.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.app.MyWeatherApp.model.WeatherResponse;

@Service
public class WeatherService {

	 private static final String API_URL = "https://api.openweathermap.org/data/2.5/weather";
	    private static final String API_KEY = "9bad3fe732d2038931d0fc604a784dd1";
	    
	    public WeatherResponse getWeather(String city) {
	    	
	    	RestTemplate restTemplate=new RestTemplate();
	    	
	    	String URL= UriComponentsBuilder.fromUriString(API_URL)
	                .queryParam("q", city)
	                .queryParam("appid", API_KEY)
	                .queryParam("units", "metric") // Get temperature in Celsius
	                .toUriString();
	    	
	    	return restTemplate.getForObject(URL, WeatherResponse.class);
	    }
}
