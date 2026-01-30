/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/26/2026
 */

package week2.strategy.lecture.characterv2b;

public abstract class MovementBehavior {
    protected Character character;
    public void setCharacter(Character character) {
        this.character = character;
    }

    public abstract void move(String direction);
}
