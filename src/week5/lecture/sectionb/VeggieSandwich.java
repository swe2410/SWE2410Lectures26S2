/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/19/2026
 */

package week5.lecture.sectionb;

/**
 * Represent a veggie sandwich
 */
public class VeggieSandwich extends Sandwich {

    /**
     * Creates a ham sandwich
     * @param size Size of the sandwich
     */
    public VeggieSandwich(String size) {
        super(size);
    }

    @Override
    public double getCost() {
        final double largeCost = 7.0;
        final double normalCost = 4.5;
        return size.equals("Large") ? largeCost : normalCost;
    }

    @Override
    public String getDescription() {
        return size + " Veggie Sandwich";
    }
}
