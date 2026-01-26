/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/26/2026
 */

package week2.strategy.lecture.ducksim3b;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
