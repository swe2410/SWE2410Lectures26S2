/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/13/2026
 */

package week4.prep.icecream;

public class KingsleySoftServe {
    public static void main(String[] args) {
        IceCreamProduct order1 = new Cone();
        order1 = new Sprinkles(order1);
        order1 = new Fudge(order1);
        order1 = new Fudge(order1);
        System.out.println(order1.description());
        System.out.printf("Price: %.2f\n", order1.cost());

//
//
//        IceCreamProduct order2 = new Cone();
//        order2 = new Fudge(order2);
//        order2 = new Fudge(order2);
//        System.out.println(order2.description());
//        System.out.printf("Price: %.2f\n", order2.cost());

    }
}
