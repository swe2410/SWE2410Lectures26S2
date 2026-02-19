/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/19/2026
 */

package week5.lecture.sectiona;

/**
 * Represent a ham sandwich
 */
public class HamSandwich extends Sandwich {

    /**
     * Creates a ham sandwich
     * @param size Size of the sandwich
     */
    public HamSandwich(String size) {
        super(size);
    }

    @Override
    public double getCost() {
        final double largeCost = 8.0;
        final double normalCost = 5.0;
        return size.equals("Large") ? largeCost : normalCost;
    }

    @Override
    public String getDescription() {
        return size + " Ham Sandwich";
    }
}
