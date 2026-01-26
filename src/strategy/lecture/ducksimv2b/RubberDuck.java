/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/5/2026
 */

package strategy.lecture.ducksimv2b;

public class RubberDuck extends Duck {

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
