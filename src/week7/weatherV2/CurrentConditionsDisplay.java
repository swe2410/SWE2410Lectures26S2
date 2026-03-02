/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 3/1/2026
 */

package week7.weatherV2;

public class CurrentConditionsDisplay
        implements Observer, DisplayElement {
    private double temperature;
    private double humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    public void update(double temperature, double humidity,
                       double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
    public void onDestroy(){
        weatherData.removeObserver(this);
    }
}