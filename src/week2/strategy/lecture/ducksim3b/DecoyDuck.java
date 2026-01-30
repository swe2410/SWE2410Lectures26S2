/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/5/2026
 */

package week2.strategy.lecture.ducksim3b;

public class DecoyDuck extends Duck {
    /**
     * Initializes a Duck
     *
     * @param quackBehavior
     */
    public DecoyDuck(QuackBehavior quackBehavior) {
        super(quackBehavior);
    }

       /**
     * Displays the duck.
     */
    @Override
    public void display() {
        System.out.println("Displays a decoy duck.");
    }
}
