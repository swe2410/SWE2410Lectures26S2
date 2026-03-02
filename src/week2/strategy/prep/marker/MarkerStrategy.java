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
        Marker marker = new Marker();
        System.out.print("What color do you want to print " +
                "text in (red, green, blue)? ");
        String color = scanner.nextLine();
        switch (color) {
            case "red":
                marker.setColor(Marker.RED);
                break;
            case "blue":
                marker.setColor(Marker.BLUE);
                break;
            case "green":
                marker.setColor(Marker.GREEN);
                break;
            default:
                System.out.println("Invalid color");
        }
        System.out.println(marker.formatText("Hello, world!"));
    }
}