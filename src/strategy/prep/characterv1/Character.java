/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/26/2026
 */

package strategy.prep.characterv1;

/**
 * Represents a very simple character
 * in a game that can move
 */
public class Character {

    private int x;
    private int y;
    private int stamina;
    private int speed;
    private String movementMode; // "walk", "run", "sneak"

    /**
     * Creates a character at a give location
     * @param x X location for the character
     * @param y Y location for the character
     */
    public Character(int x, int y, String movementMode) {
        this.x = x;
        this.y = y;
        this.stamina = 100;
        this.speed = 1;
        this.movementMode = movementMode;
    }

    public void setMovementMode(String movementMode) {
        this.movementMode = movementMode;
    }

    /**
     * Moves the character
     * @param direction Direction to move
     */
    public void move(String direction) {

        if (movementMode.equals("walk")) {
            System.out.println("Walking");
            speed = 1;

            if (direction.equals("up")) {
                y += speed;
            } else if (direction.equals("down")) {
                y -= speed;
            } else if (direction.equals("left")) {
                x -= speed;
            } else if (direction.equals("right")) {
                x += speed;
            }

            stamina -= 1;

        } else if (movementMode.equals("sneak")) {
            System.out.println("Sneaking");
            speed = 1;

            if (direction.equals("up")) {
                y += speed;
            } else if (direction.equals("down")) {
                y -= speed;
            } else if (direction.equals("left")) {
                x -= speed;
            } else if (direction.equals("right")) {
                x += speed;
            }

            stamina -= 2;

        } else {
            System.out.println("Unknown movement mode.");
        }
    }

    @Override
    public String toString() {
        return "Character at (" + x + ", " + y + ") with stamina " + stamina;
    }
}
