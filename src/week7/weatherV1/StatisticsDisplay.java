/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 3/1/2026
 */
 
package week7.weatherV1;

public class StatisticsDisplay implements DisplayElement {
    private double maxTemp = 0.0f;
    private double minTemp = 200;
    private double tempSum= 0.0f;
    private int numReadings;

    public void setTemp(double temp){
        tempSum += temp;
        numReadings++;

        if (temp > maxTemp) {
            maxTemp = temp;
        }

        if (temp < minTemp) {
            minTemp = temp;
        }
    }

    public void display() {
        System.out.printf("Avg/Max/Min temperature = %.1f/%.1f/%.1f\n",
                tempSum / numReadings, maxTemp, minTemp);
    }
}
