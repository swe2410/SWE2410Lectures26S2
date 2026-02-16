/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/9/2026
 */

package week3.coupling;

import java.util.Scanner;

public class ControlCoupling1Before {
    public static void playSound(String type){
        if(type.equals("cow")){
            System.out.println("moo");
        } else if(type.equals("cat")){
            System.out.println("meow");
        } else if (type.equals("dog")) {
            System.out.println("woof");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What type of animal do you want to play?");
        System.out.println("1.Cow\n2.Cat\nDog");
        String input = scanner.nextLine();
        if(input.equals("1")){
            playSound("cow");
        } else if (input.equals("2")){
            playSound("cat");
        } else if (input.equals("3")) {
            playSound("dog");
        }
    }
}
