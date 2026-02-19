/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/16/2026
 */

package week5.prep.icecream.badversion;

public class KingsleySoftServe {
    public static void main(String[] args) {
        IceCreamProduct order1 = new Cone();
        order1.addFudge();
        order1.addSprinkles();

        System.out.println(order1.description());
        System.out.printf("Price: %.2f\n", order1.cost());
    }
}
