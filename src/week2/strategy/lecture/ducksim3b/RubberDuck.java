/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/5/2026
 */

package week2.strategy.lecture.ducksim3b;

public class RubberDuck extends Duck {

    /**
     * Initializes a Duck
     *
     * @param quackBehavior
     */
    public RubberDuck(QuackBehavior quackBehavior) {
        super(quackBehavior);
    }

    /**
     * Makes the duck do a quack.
     */
    @Override
    public void quack() {
        System.out.println("Squeak.");
    }

    /**
     * Displays the duck.
     */
    @Override
    public void display() {
        System.out.println("Displays a rubber duck.");
    }
}
