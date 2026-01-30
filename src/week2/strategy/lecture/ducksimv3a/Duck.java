package week2.strategy.lecture.ducksimv3a;

/**
 * Abstract class that represents a Duck that is part
 * of the SimUDuck application.
 */
public abstract class Duck {
    private FlyBehavior flyBehavior;
    /**
     * Initializes a Duck
     */
    public Duck(FlyBehavior behavior){
        flyBehavior = behavior;
    }

    public void fly(){
        flyBehavior.fly();
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
        System.out.println("Quack");
    }

    /**
     * Displays the duck.
     */
    public abstract void display();

    //Other duck methods
}
