/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 3/1/2026
 */
 
package week7.weatherV1;

import java.util.Random;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay =
                new CurrentConditionsDisplay();
        ForecastDisplay forecastDisplay =
                new ForecastDisplay();
        StatisticsDisplay statisticsDisplay =
                new StatisticsDisplay();

        System.out.println("Morning weather update.");
        weatherData.setMeasurements(80, 65, 30.4);

        currentDisplay.setHumidity(weatherData.getHumidity());
        currentDisplay.setTemperature(weatherData.getTemperature());
        currentDisplay.display();

        statisticsDisplay.setTemp(weatherData.getTemperature());
        statisticsDisplay.display();

        forecastDisplay.setPressure(weatherData.getPressure());


        System.out.println("\nNoon weather update.");
        weatherData.setMeasurements(82, 70, 29.2);

        currentDisplay.setHumidity(weatherData.getHumidity());
        currentDisplay.setTemperature(weatherData.getTemperature());
        currentDisplay.display();
        statisticsDisplay.setTemp(weatherData.getTemperature());
        statisticsDisplay.display();


        forecastDisplay.setPressure(weatherData.getPressure());
        forecastDisplay.display();

        System.out.println("\nEvening weather update");
        weatherData.setMeasurements(78, 90, 29.2);

        currentDisplay.setHumidity(weatherData.getHumidity());
        currentDisplay.setTemperature(weatherData.getTemperature());
        currentDisplay.display();
        statisticsDisplay.setTemp(weatherData.getTemperature());
        statisticsDisplay.display();


        forecastDisplay.setPressure(weatherData.getPressure());
        forecastDisplay.display();

    }
}

