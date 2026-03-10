package week8.commands;

import javax.crypto.Mac;

public class MacroCommand implements Command {
    private final Command[] commands;
    public MacroCommand(Command[] commands){
        this.commands = commands;
    }
    /**
     * Method called by the invoker to execute the
     * actions of the receiver.
     */
    @Override
    public void execute() {
        for(Command command: commands){
            command.execute();
        }
    }
}
