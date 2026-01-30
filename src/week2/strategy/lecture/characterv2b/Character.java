/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/26/2026
 */

package week2.strategy.lecture.characterv2b;

/**
 * Represents a very simple character
 * in a game that can move
 */
public class Character {

    private int x;
    private int y;
    private int stamina;
    private MovementBehavior movementBehavior; // "walk" or "run"

    /**
     * Creates a character at a give location
     * @param x X location for the character
     * @param y Y location for the character
     */
    public Character(int x, int y) {
        this.x = x;
        this.y = y;
        this.stamina = 100;
    }

    public void setMovementMode(MovementBehavior movementBehavior) {
        this.movementBehavior = movementBehavior;
        this.movementBehavior.setCharacter(this);
    }

    public void setY(int y) {
        this.y = y;
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

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStamina() {
        return stamina;
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
