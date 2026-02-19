/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/19/2026
 */

package week5.prep.sandwich.solution;

public class CheeseDecorator extends SandwichDecorator{
    public CheeseDecorator(SandwichComponent sandwichComponent) {
        super(sandwichComponent);
    }

    @Override
    public double getCost() {
        final double cheeseCost = 1.0;
        return cheeseCost + sandwichComponent.getCost();
    }

    @Override
    public String getDescription() {

        return sandwichComponent.getDescription() + " + Cheese";
    }
}
