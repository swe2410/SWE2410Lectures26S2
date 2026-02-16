/*
 * Course: SWE2410 - 111, 121
 * Spring 2026
 * Lecture Code
 * Name: Adela Velez
 * Created: 2/9/2026
 */

package week3.coupling;

import java.util.Scanner;
import java.util.function.Consumer;

public class ControlCoupling1After {

    public static void playSound(Consumer<String> consumer){
        consumer.accept(null);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What type of animal do you want to play?");
        System.out.println("1.Cow\n2.Cat\n3.Dog");
        String input = scanner.nextLine();
        if(input.equals("1")){
            playSound((String _) -> System.out.println("moo"));
        } else if (input.equals("2")){
            playSound((String _) -> System.out.println("meow"));
        } else if (input.equals("3")) {
            playSound((String _) -> System.out.println("woof"));
        }
    }
}
