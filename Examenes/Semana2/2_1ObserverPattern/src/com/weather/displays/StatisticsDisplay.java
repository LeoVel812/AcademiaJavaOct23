package com.weather.displays;

import com.weather.DisplayElement;
import com.weather.Observer;
import com.weather.data.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {
	private double maxTemp = 0;
	private double minTemp = 200;
	private double tempSum = 0;
	private int numReadings;
	private WeatherData weatherData;

	public StatisticsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("AVG/Max/Min temperature: " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
	}

//	@Override
//	public void update(double temp, float humidity, float pressure) {
//		tempSum += temp;
//		numReadings++;
//		if (temp > maxTemp) {
//			maxTemp = temp;
//		}
//		if (temp < minTemp) {
//			minTemp = temp;
//		}
//		display();
//	}

	@Override
	public void update() {
		double temp = weatherData.getTemperature();
		tempSum += temp;
		numReadings++;
		if (temp > maxTemp) {
			maxTemp = temp;
		}
		if (temp < minTemp) {
			minTemp = temp;
		}
		display();
	}
}
