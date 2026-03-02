/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 3/1/2026
 */
 
package week7.weatherV2;

import java.util.Random;

public class WeatherStation {

    public static void setReading(WeatherData weatherData){
        Random random = new Random();
        int temp = random.nextInt(70, 90);
        int humidity = random.nextInt(60, 100);
        double pressure = random.nextDouble(28, 31);
        weatherData.setMeasurements(temp, humidity, pressure);
    }
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        StatisticsDisplay statisticsDisplay =
                new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay =
                new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        //Add a new display
        CurrentConditionsDisplay currentDisplay =
                new CurrentConditionsDisplay(weatherData);
        System.out.println();
        weatherData.setMeasurements(82, 70, 29.2f);

        //Remove a display
        weatherData.removeObserver(statisticsDisplay);
        System.out.println();
        weatherData.setMeasurements(62, 90, 28.1f);

        //Remove a display
        forecastDisplay.onDestroy();
        System.out.println();
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}