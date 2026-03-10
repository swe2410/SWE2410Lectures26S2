package week8.texteditor;

import java.util.*;

public class CommandDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a phrase:");
        String input = scanner.nextLine();
        TextDocument doc = new TextDocument(input);
        TextEditor editor = new TextEditor();
        boolean done = false;
        do {
            System.out.println("\nCurrent text: " + doc.getText());
            System.out.println("""
                1 - Uppercase
                2 - Exclamation marks
                3 - Swap first/last word
                4 - Undo
                0 - Quit""");
            int choice = scanner.nextInt();
            Command command = null;
            switch (choice) {
                case 1 -> command = new UppercaseCommand(doc);
                case 2 -> command = new ExclamationCommand(doc);
                case 3 -> command = new SwapCommand(doc);
                case 4 -> editor.undo();
                default -> done = true;
            }
            if(command != null) {
                editor.executeCommand(command);
            }
        } while (!done);
    }
}