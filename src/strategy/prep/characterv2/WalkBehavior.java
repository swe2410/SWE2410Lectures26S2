/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/26/2026
 */

package strategy.prep.characterv2;

public class WalkBehavior extends MovementBehavior {
    public WalkBehavior(Character character) {
        super(character);
    }

    @Override
    public void move(String direction) {
        System.out.println("Walking");
        int speed = 1;
        if (direction.equals("up")) {
            character.setY(character.getY() + speed);
        } else if (direction.equals("down")) {
            character.setY(character.getY() - speed);
        } else if (direction.equals("left")) {
            character.setX(character.getX() - speed);
        } else if (direction.equals("right")) {
            character.setX(character.getX() + speed);
        }
        character.setStamina(character.getStamina() - 1);
    }
}
