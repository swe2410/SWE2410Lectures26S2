package prep.animals;

import java.util.Scanner;

public class SeeNSayv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ans;
        do {
            System.out.println("Which animal sound would you like to hear?");
            System.out.println("A.Dog\nB.Cat\nC.Quit\n");
            ans = scanner.nextLine();
            Animal animal;
            switch (ans.toLowerCase()) {
                case "a":
                    animal = new Dog();
                    System.out.println("The dog says: ");
                    break;
                case "b":
                    animal = new Cat();
                    System.out.println("The cat says: ");
                    break;
                default:
                    animal = null;
                    System.out.println("Quiting");
                    break;
            }
            if(animal != null){
                animal.makeSound();
            }
        }
        while (!ans.equalsIgnoreCase("c"));
    }
}
