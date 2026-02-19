/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/19/2026
 */

package week5.prep.sandwich.solution;


public class SandwichDriver {
    public static void main(String[] args) {
        SandwichComponent order1 = new HamSandwich("Normal");
        order1 = new CheeseDecorator(order1);
        order1 = new SauceDecorator(order1);
        System.out.println(order1.getDescription());
        System.out.println("Cost: "+ order1.getCost());
    }
}
