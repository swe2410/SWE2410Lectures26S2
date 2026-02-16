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

public class Driver3 {
    private static class Calculator {
        private double circleArea(double r) {
            return Math.PI * r * r;
        }
    }
    private static class InputService {
        private Scanner sc = new Scanner(System.in);
        private double getRadius(){
            System.out.print("Enter radius: ");
            return sc.nextDouble();
        }
    }
    private static class Validator {
        private boolean validateRadius(double r){
            return r > 0;
        }
    }
    private static class ResultRenderer {
        private void display(double area){
            System.out.printf("Area = %.2f%n", area);
        }
    }
    private static class ResultRepository {
        private void save(double area){
            Path filePath = Paths.get("data/week4/output.txt");
            try (OutputStream out = Files.newOutputStream(filePath);
                 PrintWriter printWriter = new PrintWriter(out)){
                printWriter.println("Area: " + area + "\n");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public static void main(String[] args) {
        InputService input = new InputService();
        Validator validator = new Validator();
        Calculator calculator = new Calculator();
        ResultRenderer renderer = new ResultRenderer();
        ResultRepository repo = new ResultRepository();

        double r = input.getRadius();
        validator.validateRadius(r);

        double area = calculator.circleArea(r);
        renderer.display(area);
        repo.save(area);
    }
}



