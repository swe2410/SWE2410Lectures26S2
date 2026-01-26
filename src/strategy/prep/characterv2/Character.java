/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/26/2026
 */

package strategy.prep.characterv2;

/**
 * Represents a very simple character
 * in a game that can move
 */
public class Character {
    private int x;
    private int y;
    private int stamina;
    private int speed;
    private MovementBehavior movementBehavior;

    /**
     * Creates a character at a give location
     * @param x X location for the character
     * @param y Y location for the character
     * @param movementType walk or sneak
     * @throws IllegalArgumentException if the movementType is invalid
     */
    public Character(int x, int y, String movementType)
            throws IllegalArgumentException{
        this.x = x;
        this.y = y;
        this.stamina = 100;
        this.speed = 1;
        if(movementType.equalsIgnoreCase("walk")){
            this.movementBehavior = new WalkBehavior(this);
        } else if (movementType.equalsIgnoreCase("sneak")){
            this.movementBehavior = new SneakBehavior(this);
        } else {
            throw new IllegalArgumentException("Invalid movement type "+movementType);
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }


    /**
     * Moves the character
     * @param direction Direction to move
     */
    public void move(String direction) {
        movementBehavior.move(direction);
    }

    @Override
    public String toString() {
        return "Character at (" + x + ", " + y + ") with stamina " + stamina;
    }
}
