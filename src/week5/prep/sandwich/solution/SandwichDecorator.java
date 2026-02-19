/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/19/2026
 */

package week5.prep.sandwich.solution;

public class SandwichDecorator implements SandwichComponent {
    protected SandwichComponent sandwichComponent;
    public SandwichDecorator(SandwichComponent sandwichComponent){
        this.sandwichComponent = sandwichComponent;
    }
    @Override
    public double getCost() {
        return sandwichComponent.getCost();
    }
    @Override
    public String getSize() {
        return sandwichComponent.getSize();
    }
    @Override
    public String getDescription() {
        return sandwichComponent.getDescription();
    }
}
