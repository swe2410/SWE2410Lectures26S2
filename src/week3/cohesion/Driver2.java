/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/11/2026
 */

package week3.cohesion;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Driver2 {
    private static Path filePath =
            Paths.get("data/week4/output.txt");
    public static void main(String[] args) throws IOException {
        double r = getRadius();
        if (isValid(r)) {
            double area = calculateArea(r);
            display(area);
            save(area);
        }
    }
    private static double getRadius() throws IOException {
        filePath = Paths.get("data/week4/input.txt");
        Scanner sc = new Scanner(filePath);
        //Scanner sc = new Scanner(System.in);
        //System.out.print("Enter radius: ");
        return sc.nextDouble();
    }
    private static boolean isValid(double r) {
        return r > 0;
    }
    private static double calculateArea(double r) {
        return Math.PI * r * r;
    }
    private static void display(double area) {
        System.out.printf("Area = %.2f%n", area);
    }
    private static void save(double area) {
        try (OutputStream out = Files.newOutputStream(filePath);
             PrintWriter printWriter = new PrintWriter(out)){
            printWriter.println("Area: " + area + "\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}


