/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/5/2026
 */

package week2.strategy.prep.ducksimv3.behaviors;

public class Quack implements QuackBehavior {
    /**
     * Allows an object to quack.
     */
    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
