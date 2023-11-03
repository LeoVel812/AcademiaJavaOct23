package com.weather.data;

import java.util.ArrayList;
import java.util.List;

import com.weather.Observer;
import com.weather.Subject;

public class WeatherData implements Subject {

	private List<Observer> observers;
	private double temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
//			observer.update(temperature, humidity, pressure);
			observer.update();
		}
	}

	public void measurementsChanged() {
		notifyObservers();
	}

	public void setMeasurements(double temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	public void setMeasurements() {
		this.temperature = Math.round(((Math.random() * (45 - (-10))) - 10) * 100.0) / 100.0;// doubles from -10 to 45
		this.humidity = (float) (Math.round(Math.random() * (70) * 100.0) / 100.0);// floats from 0 to 70
		this.pressure = (float) (Math.round(Math.random() * (40) * 100.0) / 100.0);// floats from 0 to 40
		measurementsChanged();
	}

	public double getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

}
