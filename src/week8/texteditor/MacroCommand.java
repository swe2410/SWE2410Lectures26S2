package week8.texteditor;

import java.util.List;

public class MacroCommand implements Command {
    private List<Command> commands;
    public MacroCommand(List<Command> commands) {
        this.commands = commands;
    }
    public void execute() {
        for (Command c : commands) {
            c.execute();
        }
    }
    public void undo() {
        //Note that this is going in reverse order
        for (int i = commands.size() - 1; i >= 0; i--) {
            commands.get(i).undo();
        }
    }
}