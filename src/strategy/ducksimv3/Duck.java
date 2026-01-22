package strategy.ducksimv3;

import week2.strategy.ducksimv3.behaviors.FlyBehavior;
import week2.strategy.ducksimv3.behaviors.QuackBehavior;

/**
 * Abstract class that represents a Duck that is part
 * of the SimUDuck application.
 */
public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    /**
     * Initializes a duck we specific fly and quack behaviors.
     * @param flyBehavior How this duck flys.
     * @param quackBehavior How this duck quacks.
     */
    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior){
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    /**
     * Makes the duck swim.
     */
    public void swim(){
        System.out.println("Bobs up and down in the water.");
    }
    /**
     * Makes the duck do a quack.
     */
    public void quack() {
        quackBehavior.quack();
    }

    /**
     * Displays the duck.
     */
    public abstract void display();

    /**
     * Makes the duck do a fly.
     */
    public void fly() {
        flyBehavior.fly();
    }
    //Other duck methods
}
