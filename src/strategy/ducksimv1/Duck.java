package strategy.ducksimv1;

/**
 * Class that represents a Duck that is part
 * of the SimUDuck application.
 */
public class Duck {
    private final String type;

    /**
     * Creates an instance of a Duck with a given type.
     * The type determines what types of behaviors this
     * Duck does.
     * @param type The type of Duck. Currently available
     *             types are RubberDuck, MallardDuck, and
     *             RedHeadDuck
     */
    public Duck(String type){
        this.type = type;
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
    public void quack(){
        if(type.equalsIgnoreCase("RubberDuck")){
            System.out.println("Squeak!");
        } else if (type.equalsIgnoreCase("DecoyDuck")) {
            System.out.println("---Silence---");
        } else{
            System.out.println("Quack!");
        }
    }
    /**
     * Displays the duck.
     */
    public void display(){
        if(type.equalsIgnoreCase("RubberDuck")){
            System.out.println("Displaying a yellow rubber duck.");
        } else if(type.equalsIgnoreCase("MallardDuck")){
            System.out.println("Displaying a mallard duck.");
        } else if(type.equalsIgnoreCase("RedHeadDuck")){
            System.out.println("Displaying a redhead duck.");
        } else if(type.equalsIgnoreCase("DecoyDuck")){
            System.out.println("Displaying a decoy duck.");
        }
    }
    /**
     * Flies the duck
     */
    public void fly(){
        if(type.equalsIgnoreCase("RubberDuck") ||
                type.equalsIgnoreCase("DecoyDuck")){
            System.out.println("Can't fly.");
        } else{
            System.out.println("Flies up, up, and away!!!");
        }
    }
    //Other duck methods
}


