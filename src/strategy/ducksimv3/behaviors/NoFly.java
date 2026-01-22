/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/5/2026
 */

package strategy.ducksimv3.behaviors;

public class NoFly implements FlyBehavior {
    /**
     * Allows an object to fly.
     */
    @Override
    public void fly() {
        System.out.println("I can't fly.");
    }
}
