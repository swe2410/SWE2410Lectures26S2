/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/5/2026
 */

package week2.strategy.lecture.ducksimv3a;

public class DecoyDuck extends Duck {
    /**
     * Initializes a Duck
     *
     * @param behavior
     */
    public DecoyDuck(FlyBehavior behavior) {
        super(behavior);
    }

    @Override
    public void quack() {

    }

    /**
     * Displays the duck.
     */
    @Override
    public void display() {
        System.out.println("Displays a decoy duck.");
    }
}
