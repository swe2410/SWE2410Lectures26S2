/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/19/2026
 */

package prep.oopexample;

public abstract class Shape {
    protected double formatValue(double value){
        return Math.floor(value);
    }
    public abstract double area();
}
