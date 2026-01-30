/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/5/2026
 */

package week2.strategy.prep.ducksimv3.behaviors;

public class FlyWithRockets implements FlyBehavior{
    /**
     * Allows an object to fly.
     */
    @Override
    public void fly() {
        System.out.println("Blast off!!! Flying with rocket power!!!");
    }
}
