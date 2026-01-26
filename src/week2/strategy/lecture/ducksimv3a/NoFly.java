/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/26/2026
 */

package week2.strategy.lecture.ducksimv3a;

public class NoFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Doesn't fly");
    }
}
