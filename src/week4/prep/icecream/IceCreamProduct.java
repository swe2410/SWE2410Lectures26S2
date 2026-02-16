package week4.prep.icecream;

/**
 * Interface that represents a concreate confection
 * such as a cone or dish, but also decorators
 * like sprinkles or fudge
 */
public interface IceCreamProduct {
    /**
     * Returns the cost of the item
     * @return Cost of the item
     */
    double cost();

    /**
     * Returns a description of the item
     * @return Description of the item
     */
    String description();
}
