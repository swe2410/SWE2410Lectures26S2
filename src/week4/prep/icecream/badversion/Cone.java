/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/13/2026
 */

package week4.prep.icecream.badversion;

/**
 * Class that represents an Ice Cream Cone
 */
public class Cone extends IceCreamProduct {
    /**
     * Returns the cost of the item
     *
     * @return Cost of the item
     */
    @Override
    public double cost() {
        final double price = 1.25;
        return super.cost() + price;
    }
    /**
     * Returns a description of the item
     *
     * @return Description of the item
     */
    @Override
    public String description() {
        return super.description() + "Ice Cream Cone";
    }
}
