package week2.strategy.lecture.ducksim3b;

/**
 * Abstract class that represents a Duck that is part
 * of the SimUDuck application.
 */
public abstract class Duck {

    private QuackBehavior quackBehavior;
    /**
     * Initializes a Duck
     */
    public Duck(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }
    /**
     * Makes the duck swim.
     */
    public void swim(){
        System.out.println("Duck bobs up and down in the water.");
    }
    /**
     * Makes the duck do a quack.
     */
    public void quack() {
        quackBehavior.quack();
    }

    public  void fly(){
        System.out.println("Up, up, and away!!!");
    }
    /**
     * Displays the duck.
     */
    public abstract void display();

    //Other duck methods
}
