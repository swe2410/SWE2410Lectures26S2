/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/26/2026
 */

package strategy.prep.characterv2;

public abstract class MovementBehavior {
    protected java.lang.Character character;
    public MovementBehavior(java.lang.Character character){
        this.character = character;
    }
    public abstract void move(String direction);
}
