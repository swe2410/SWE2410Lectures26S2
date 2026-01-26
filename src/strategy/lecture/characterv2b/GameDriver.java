/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 1/26/2026
 */

package strategy.lecture.characterv2b;

import java.util.ArrayList;
import java.util.List;

public class GameDriver {

    public static void main(String[] args) {

        List<java.lang.Character> characters = new ArrayList<>();

        java.lang.Character walker = new java.lang.Character(0, 0, "walk");
        walker.setMovementMode("walk");

        java.lang.Character sneaker = new java.lang.Character(5, 5, "sneak");
        sneaker.setMovementMode("sneak");

        characters.add(walker);
        characters.add(sneaker);

        // Move all characters up
        for(int i = 0; i<characters.size(); i++){
            System.out.println("Character "+i);
            System.out.println("Current position");
            System.out.println(characters.get(i));
            System.out.println("Moving up");
            characters.get(i).move("up");
            System.out.println(characters.get(i));
            System.out.println();
        }

        //Character 0 decides to sneak
        characters.get(0).setMovementMode("sneak");

        // Move all characters up
        for(int i = 0; i<characters.size(); i++){
            System.out.println("Character "+i);
            System.out.println("Current position");
            System.out.println(characters.get(i));
            System.out.println("Moving up");
            characters.get(i).move("up");
            System.out.println(characters.get(i));
            System.out.println();
        }
    }
}

