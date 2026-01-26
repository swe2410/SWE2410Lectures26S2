package strategy.lecture.ducksim3b;

/**
 * Abstract class that represents a Duck that is part
 * of the SimUDuck application.
 */
public abstract class Duck {
    /**
     * Initializes a Duck
     */
    public Duck(){

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
