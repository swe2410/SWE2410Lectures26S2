/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/19/2026
 */

package week5.lecture.sectiona;

public class SandwichDriver {
    public static void main(String[] args) {
        Sandwich order1 = new HamSandwich("Normal");
        System.out.println(order1.getDescription());
        System.out.println("Cost: "+ order1.getCost());

        Sandwich order2 = new VeggieSandwich("Large");
        System.out.println(order2.getDescription());
        System.out.println("Cost: " + order2.getCost());
    }
}
