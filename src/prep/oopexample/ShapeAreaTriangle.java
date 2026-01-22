/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/19/2026
 */

package prep.oopexample;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShapeAreaTriangle {
    public static double calcArea(String type, double[] data){
        return switch (type) {
            case "circle" -> Math.PI * 2 * data[0];
            case "square" -> data[0] * data[0];
            case "triangle" -> data[0] * data[2] * 0.5;
            default -> 0;
        };
    }
    public static void main(String[] args) throws IOException {
        //Loads the contents of the file
        String filename = "data/week1/shapes.txt";
        List<String> shapeData = new ArrayList<>();
        Scanner fileIn = new Scanner(new FileInputStream(filename));
        while (fileIn.hasNextLine()){
            shapeData.add(fileIn.nextLine());
        }
        //Calculate the areas and add to a list
        List<Double> areas = new ArrayList<>();
        for (String shape : shapeData) {
            String[] parts = shape.split(",");
            String type = parts[0].toLowerCase().trim();
            double[] data = null;
            if(type.equalsIgnoreCase("circle")){
                data = new double[1];
                data[0] = Double.parseDouble(parts[1]);
            } else if (type.equalsIgnoreCase("square")){
                data = new double[2];
                data[0] = Double.parseDouble(parts[1]);
            } else if (type.equalsIgnoreCase("triangle")){
                data = new double[2];
                data[0] = Double.parseDouble(parts[1]);
                data[1] = Double.parseDouble(parts[2]);
            }
            areas.add(calcArea(type, data));
        }
        //Sort the list from smallest to largest w/ selection sort
        for(int i = 0; i < areas.size(); i++){
            for(int j = i + 1; j < areas.size(); j++){
                if(areas.get(j) < areas.get(i)){
                    double swap = areas.get(i);
                    areas.set(i, areas.get(j));
                    areas.set(j, swap);
                }
            }
        }
        //Prints out the areas
        System.out.println("Shape Areas (smallest to largest):");
        for (double a : areas) {
            System.out.printf("%.2f%n", a);
        }
    }
}
