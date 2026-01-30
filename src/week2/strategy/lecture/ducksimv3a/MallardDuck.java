/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/5/2026
 */

package week2.strategy.lecture.ducksimv3a;

public class MallardDuck extends Duck {
    /**
     * Initializes a Duck
     *
     * @param behavior
     */
    public MallardDuck(FlyBehavior behavior) {
        super(behavior);
    }

    /**
     * Displays the duck.
     */
    @Override
    public void display() {
        System.out.println("Displays a Mallard Duck");
    }
}
