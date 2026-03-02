/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 3/1/2026
 */

package week7.weatherV2;

public interface Observer {
    public void update(double temp, double humidity,
                       double pressure);
}
