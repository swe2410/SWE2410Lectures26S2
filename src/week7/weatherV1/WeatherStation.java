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

    public static void setReading(WeatherData weatherData){
        Random random = new Random();
        int temp = random.nextInt(70, 90);
        int humidity = random.nextInt(60, 100);
        double pressure = random.nextDouble(28, 31);
        weatherData.setMeasurements(temp, humidity, pressure);
    }
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();

        System.out.println("Morning weather update.");
        weatherData.setMeasurements(80, 65, 30.4);

        currentDisplay.setHumidity(weatherData.getHumidity());
        currentDisplay.setTemperature(weatherData.getTemperature());
        currentDisplay.display();

        forecastDisplay.setPressure(weatherData.getPressure());
        forecastDisplay.display();

        statisticsDisplay.setTemp(weatherData.getTemperature());
        statisticsDisplay.display();

        System.out.println("\nNoon weather update.");
        weatherData.setMeasurements(82, 70, 29.2);

        currentDisplay.setHumidity(weatherData.getHumidity());
        currentDisplay.setTemperature(weatherData.getTemperature());
        currentDisplay.display();

        forecastDisplay.setPressure(weatherData.getPressure());
        forecastDisplay.display();

        statisticsDisplay.setTemp(weatherData.getTemperature());
        statisticsDisplay.display();

        System.out.println("\nEvening weather update");
        weatherData.setMeasurements(78, 90, 29.2);

        currentDisplay.setHumidity(weatherData.getHumidity());
        currentDisplay.setTemperature(weatherData.getTemperature());
        currentDisplay.display();

        forecastDisplay.setPressure(weatherData.getPressure());
        forecastDisplay.display();

        statisticsDisplay.setTemp(weatherData.getTemperature());
        statisticsDisplay.display();
    }
}

