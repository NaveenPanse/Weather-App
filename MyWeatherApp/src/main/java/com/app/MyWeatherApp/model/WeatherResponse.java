package com.app.MyWeatherApp.model;

import java.util.List;

public class WeatherResponse {
	 private Main main;
	    
	    
	    private String name; // City Name
		public Main getMain() {
			return main;
		}
		public void setMain(Main main) {
			this.main = main;
		}
		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	    
	    
}
