/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/13/2026
 */

package week5.prep.icecream;

public class Sprinkles extends Toppings {
    public Sprinkles(IceCreamProduct product) {
        super(product);
    }
    /**
     * Returns the cost of the item
     *
     * @return Cost of the item
     */
    @Override
    public double cost() {
        final double sprinklesPrice = 0.1;
        return product.cost() + sprinklesPrice;
    }
    /**
     * Returns a description of the item
     *
     * @return Description of the item
     */
    @Override
    public String description() {
        return "Sprinkle " + product.description();
    }
}
