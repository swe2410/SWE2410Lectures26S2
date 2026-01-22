/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/19/2026
 */

package prep.oopexample;

public class Triangle extends Shape {
    private final double base;
    private final double height;
    public Triangle(double height, double width){
        this.height = height;
        this.base = width;
    }
    @Override
    public double area() {
        return formatValue(base * height * 0.5);
    }
}
