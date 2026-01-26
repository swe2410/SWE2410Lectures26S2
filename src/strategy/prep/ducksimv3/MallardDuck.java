/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/5/2026
 */

package strategy.prep.ducksimv3;

import week2.strategy.prep.ducksimv3.behaviors.FlyBehavior;
import week2.strategy.prep.ducksimv3.behaviors.QuackBehavior;

public class MallardDuck extends Duck {
    /**
     * Initializes a duck we specific fly and quack behaviors.
     *
     * @param flyBehavior   How this duck flys.
     * @param quackBehavior How this duck quacks.
     */
    public MallardDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }
    /**
     * Displays the duck.
     */
    @Override
    public void display() {
        System.out.println("Displays a Mallard Duck");
    }
}
