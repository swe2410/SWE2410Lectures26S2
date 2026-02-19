/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/13/2026
 */

package week5.prep.icecream;
/**
 * Class that represents an Ice Cream Cone
 */
public class Cone implements IceCreamProduct {
    /**
     * Returns the cost of the item
     *
     * @return Cost of the item
     */
    @Override
    public double cost() {
        final double price = 1.25;
        return price;
    }

    /**
     * Returns a description of the item
     *
     * @return Description of the item
     */
    @Override
    public String description() {
        return "Ice Cream Cone";
    }
}
