/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/19/2026
 */

package prep.oopexample;

public class Circle extends Shape {
    private final double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double area() {
        return formatValue(radius * radius * Math.PI);
    }
}
