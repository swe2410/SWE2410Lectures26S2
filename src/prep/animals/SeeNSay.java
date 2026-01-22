package prep.animals;

import java.util.Scanner;

public class SeeNSay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ans;
        do {
            System.out.println("Which animal sound would you like to hear?");
            System.out.println("A.Dog\nB.Cat\nC.Quit\n");
            ans = scanner.nextLine();

            switch (ans.toLowerCase()) {
                case "a":
                    Dog dog = new Dog();
                    System.out.println("The dog says: ");
                    dog.makeSound();
                    break;
                case "b":
                    Cat cat = new Cat();
                    System.out.println("The cat says: ");
                    cat.makeSound();
                    break;
                default:
                    System.out.println("Quiting");
                    break;
            }
        }
        while (!ans.equalsIgnoreCase("c"));
    }
}
