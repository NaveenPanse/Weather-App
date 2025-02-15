package com.app.MyWeatherApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.MyWeatherApp.model.WeatherResponse;
import com.app.MyWeatherApp.service.WeatherService;

@Controller
public class WeatherController {

	@Autowired
	private WeatherService weatherService;
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@GetMapping("/weather")
	public String getWeather(@RequestParam String city,Model model) {
		WeatherResponse weather= weatherService.getWeather(city);
		model.addAttribute("weather",weather);
		return "index";
	}
	
}
