package com.app.MyWeatherApp.model;

public class Main {

	private double temp;
    private double feels_like;
    private int pressure;
    private int humidity;
	public double getTemp() {
		return temp;
	}
	public double getFeels_like() {
		return feels_like;
	}
	public int getPressure() {
		return pressure;
	}
	public int getHumidity() {
		return humidity;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
	public void setFeels_like(double feels_like) {
		this.feels_like = feels_like;
	}
	public void setPressure(int pressure) {
		this.pressure = pressure;
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
    
}
