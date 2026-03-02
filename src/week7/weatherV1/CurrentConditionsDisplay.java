/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 3/1/2026
 */

package week7.weatherV1;

public class CurrentConditionsDisplay implements DisplayElement {
    private double temperature;
    private double humidity;

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}