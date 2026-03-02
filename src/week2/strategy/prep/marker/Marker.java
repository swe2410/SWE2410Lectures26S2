/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/23/2026
 */

package week2.strategy.prep.marker;

public class Marker {
    public static final String RESET = "\u001B[0m";
    public static final String RED   = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String BLUE  = "\u001B[34m";
    private String color;
    public Marker() {
        this.color = RESET;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String formatText(String text) {
        switch (color) {
            case "red":
                return RED + text + RESET;
            case "green":
                return GREEN + text + RESET;
            case "blue":
                return BLUE + text + RESET;
            default:
                return text;
        }
    }
}
