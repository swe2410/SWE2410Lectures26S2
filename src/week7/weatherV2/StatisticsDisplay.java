/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 3/1/2026
 */
 
package week7.weatherV2;
public class StatisticsDisplay implements Observer, DisplayElement {
    private double maxTemp = 0.0f;
    private double minTemp = 200;
    private double tempSum= 0.0f;
    private int numReadings;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(double temp, double humidity, double pressure) {
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

    public void display() {
        System.out.printf("Avg/Max/Min temperature = %.1f/%.1f/%.1f\n",
                tempSum / numReadings, maxTemp, minTemp);
    }
}
