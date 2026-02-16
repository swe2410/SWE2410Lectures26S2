/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/13/2026
 */

package week4.prep.icecream;

public class Fudge extends Toppings {
    public Fudge(IceCreamProduct confection) {
        super(confection);
    }
    /**
     * Returns the cost of the item
     *
     * @return Cost of the item
     */
    @Override
    public double cost() {
        final double fudgePrice = 0.5;
        return product.cost() + fudgePrice;
    }

    /**
     * Returns a description of the item
     *
     * @return Description of the item
     */
    @Override
    public String description() {
        return "Fudge "+ product.description();
    }
}
