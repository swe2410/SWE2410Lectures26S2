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

public class Driver1 {
    public static void main(String[] args) {
        Path filePath = Paths.get("data/week4/output.txt");
        Scanner sc = new Scanner(System.in);

        //input
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        //validation
        if (r > 0) {
            //calculation
            double area = Math.PI * r * r;

            //display
            System.out.printf("Area = %.2f%n", area);

            //save
            try {
                OutputStream out =
                        Files.newOutputStream(filePath);
                 PrintWriter printWriter =
                         new PrintWriter(out);
                printWriter.println("Area: " + area + "\n");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Radius must be positive");
        }
    }
}

