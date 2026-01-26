/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/23/2026
 */

package week2.strategy.prep.marker;

import java.util.Scanner;

public class MarkerStrategy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What color do you want to print text in (red, green, blue)? ");
        String color = scanner.nextLine();

        Marker marker = new Marker(color);

        System.out.println(marker.formatText("Hello, world!"));

        scanner.close();
    }
}