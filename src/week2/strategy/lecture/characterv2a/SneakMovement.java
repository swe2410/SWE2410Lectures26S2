/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/30/2026
 */

package week2.strategy.lecture.characterv2a;

public class SneakMovement extends MoveBehavior {
    @Override
    public void move(String direction) {
        if(character != null) {
            System.out.println("Sneaking");
            int speed = 1;

            if (direction.equals("up")) {
                character.y += speed;
            } else if (direction.equals("down")) {
                character.y -= speed;
            } else if (direction.equals("left")) {
                character.x -= speed;
            } else if (direction.equals("right")) {
                character.x += speed;
            }

            character.stamina -= 1;
        }
    }
}
