/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/13/2026
 */

package week5.prep.icecream;

public class Cup implements IceCreamProduct {

    /**
     * Returns the cost of the item
     *
     * @return Cost of the item
     */
    @Override
    public double cost() {
        return 1.0;
    }

    /**
     * Returns a description of the item
     *
     * @return Description of the item
     */
    @Override
    public String description() {
        return "Ice Cream Cup";
    }
}
