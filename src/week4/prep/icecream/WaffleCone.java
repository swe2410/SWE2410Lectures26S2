/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/13/2026
 */

package week4.prep.icecream;

/**
 * Represents a waffle cone ice cream
 */
public class WaffleCone implements IceCreamProduct {
    /**
     * Returns the cost of the item
     *
     * @return Cost of the item
     */
    @Override
    public double cost() {
        return 2.00;
    }

    /**
     * Returns a description of the item
     *
     * @return Description of the item
     */
    @Override
    public String description() {
        return "Ice Cream Waffle Cone";
    }
}
