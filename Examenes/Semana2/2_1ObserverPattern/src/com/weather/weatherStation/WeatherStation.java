package com.weather.weatherStation;

import com.weather.data.WeatherData;
import com.weather.displays.CurrentConditionsDisplay;
import com.weather.displays.ForecastDisplay;
import com.weather.displays.StatisticsDisplay;

public class WeatherStation {

	public static void main(String[] args) {
		// Subject:
		WeatherData weatherData = new WeatherData(); // creating a new WeatherData instance, to supply measurements

		// instantiating the three types of Displays (Observers)
		// at the call of the constructor, internally calls the register method
		CurrentConditionsDisplay currentDisp = new CurrentConditionsDisplay(weatherData);

		StatisticsDisplay statisticsDisp = new StatisticsDisplay(weatherData);

		ForecastDisplay forecastDisp = new ForecastDisplay(weatherData);

		// Putting some measurements and printing the information from the displays
		weatherData.setMeasurements(40, 65.0f, 30.4f);
		weatherData.setMeasurements(35, 40.0f, 28.3f);
		weatherData.setMeasurements();// random values
		weatherData.setMeasurements();// random values

		//removing forecast display:
		weatherData.removeObserver(forecastDisp);
		
		//updating observers with new values:
		weatherData.setMeasurements();// random values		

	}

}
