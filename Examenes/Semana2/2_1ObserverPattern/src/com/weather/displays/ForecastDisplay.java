package com.weather.displays;

import com.weather.DisplayElement;
import com.weather.Observer;
import com.weather.data.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {
	private double currentPressure = 29.92;
	private double lastPressure;
	private WeatherData weatherData;

	public ForecastDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("The weather is improving!!! :)");
		} else if (currentPressure < lastPressure) {
			System.out.println("Maybe you're like to get wet...");
		} else {
			System.out.println("It's constant, like problems");
		}

	}

//	@Override
//	public void update(double temp, float humidity, float pressure) {
//		lastPressure = currentPressure;
//		currentPressure = pressure;
//		display();
//	}

	@Override
	public void update() {
		lastPressure = currentPressure;
		currentPressure = weatherData.getPressure();
		display();
	}
}