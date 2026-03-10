package week8.texteditor;

import java.util.ArrayDeque;

public class TextEditor {
    //We are treating history as a stack
    private final ArrayDeque<Command> history = new ArrayDeque<>();
    public void executeCommand(Command command) {
        command.execute();
        history.push(command);
    }
    public void undo() {
        if (!history.isEmpty()) {
            Command command = history.pop();
            command.undo();
        } else {
            System.out.println("Nothing to undo.");
        }
    }
}