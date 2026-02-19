/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/19/2026
 */

package week5.prep.sandwich.solution;

public class SauceDecorator extends SandwichDecorator{
    public SauceDecorator(SandwichComponent sandwichComponent) {
        super(sandwichComponent);
    }

    @Override
    public double getCost() {
        final double cheeseCost = 0.5;
        return cheeseCost + sandwichComponent.getCost();
    }

    @Override
    public String getDescription() {

        return sandwichComponent.getDescription() + " + Sauce";
    }
}
