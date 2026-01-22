/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/19/2026
 */

package prep.oopexample;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShapeAreaOOP {
    public static Shape makeShape(String shapeData){
        Shape ret = null;
        String[] parts = shapeData.split(",");
        String type = parts[0].toLowerCase().trim();
        if(type.equalsIgnoreCase("circle")){
            ret = new Circle(Double.parseDouble(parts[1]));
        } else if (type.equalsIgnoreCase("rectangle")){
            ret = new Rectangle(Double.parseDouble(parts[1]),
                    Double.parseDouble(parts[2]));
        } else if (type.equalsIgnoreCase("triangle")){
            ret = new Triangle(Double.parseDouble(parts[1]),
                    Double.parseDouble(parts[2]));
        }
        return ret;
    }
    public static void main(String[] args) throws IOException {
        //Loads the contents of the file
        String filename = "data/week1/shapes.txt";
        List<String> shapeData = Files.readAllLines(Path.of(filename));

        //Calculate the areas and add to a list
        List<Double> areas = new ArrayList<>();
        for (String data : shapeData) {
            Shape shape = makeShape(data);
            areas.add(shape.area());
        }
        Collections.sort(areas);
        //Prints out the areas
        System.out.println("Shape Areas (smallest to largest):");
        for (double a : areas) {
            System.out.printf("%.2f%n", a);
        }
    }
}
