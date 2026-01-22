/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/19/2026
 */

package prep.oopexample;

public class Rectangle extends Shape {
    private final double width;
    private final double height;
    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }
    @Override
    public double area() {
        return formatValue(width * height);
    }
}
