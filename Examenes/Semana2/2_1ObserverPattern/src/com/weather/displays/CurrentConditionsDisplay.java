package com.weather.displays;

import com.weather.DisplayElement;
import com.weather.Observer;
import com.weather.data.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private double temperature;
	private float humidity;
	private WeatherData weatherData;

	public CurrentConditionsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Current conditions are: temperature = " + this.temperature + " °C and " + this.humidity
				+ " % humidity");
	}

//	@Override
//	public void update(double temperature, float humidity, float pressure) {
//		this.temperature = temperature;
//		this.humidity = humidity;
//		display();
//	}

	@Override
	public void update() {
		this.temperature = weatherData.getTemperature();
		this.humidity = weatherData.getHumidity();
		display();
	}

}
