/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/26/2026
 */

package week2.strategy.prep.characterv2;

import java.util.ArrayList;
import java.util.List;

public class GameDriver {
    public static void main(String[] args) {

        List<Character> characters = new ArrayList<>();

        Character character1 = new Character(0, 0);
        character1.setMovementMode(new WalkBehavior());

        Character character2 = new Character(5, 5);
        character2.setMovementMode(new RunBehavior());

        characters.add(character1);
        characters.add(character2);

        // Move all characters up
        for(int i = 0; i<characters.size(); i++){
            System.out.println("Character "+i);
            System.out.println("Current position");
            System.out.println(characters.get(i));
            characters.get(i).move("up");
            System.out.println(characters.get(i));
            System.out.println();
        }

        //Character 1 decides to walk
        characters.get(1).setMovementMode(new WalkBehavior());

        // Move all characters up
        for(int i = 0; i<characters.size(); i++){
            System.out.println("Character "+i);
            System.out.println("Current position");
            System.out.println(characters.get(i));
            characters.get(i).move("up");
            System.out.println(characters.get(i));
            System.out.println();
        }
    }
}

