/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/26/2026
 */

package week2.strategy.lecture.characterv2b;

public class RunBehavior extends MovementBehavior {
    @Override
    public void move(String direction) {
        System.out.println("Sneaking");
        int speed = 10;
        if (direction.equals("up")) {
            character.setY(character.getY() + speed);
        } else if (direction.equals("down")) {
            character.setY(character.getY() - speed);
        } else if (direction.equals("left")) {
            character.setX(character.getX() - speed);
        } else if (direction.equals("right")) {
            character.setX(character.getX() + speed);
        }
        character.setStamina(character.getStamina() - 10);
    }
}
