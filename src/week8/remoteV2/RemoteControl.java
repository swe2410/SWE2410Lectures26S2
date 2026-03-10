package week8.remoteV2;

import week8.commands.Command;
import week8.commands.NoCommand;

/**
 * Remote Control object that acts as the invoker
 */
public class RemoteControl {
    private final Command[] onCommands;
    private final Command[] offCommands;
    /**
     * Creates a new remote with the default
     * commands set to noCommand
     */
    public RemoteControl() {
        final int numSlots = 7;
        onCommands = new Command[numSlots];
        offCommands = new Command[numSlots];

        Command noCommand = new NoCommand();
        for (int i = 0; i < numSlots; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    /**
     * Sets the on and off command for a slot
     * @param slot Controller slot to set 0 - numSlots
     * @param onCommand On command for this slot
     * @param offCommand Off command for this slot
     */
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }
    /**
     * Simulates pressing the on button for a given slot
     * @param slot Slot to press
     */
    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }
    /**
     * Simulates pressing the off button for a given slot
     * @param slot Slot to press
     */
    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    /**
     * Prints a String representation for the controller
     * @return String that shows the currently loaded commands
     */
    public String toString() {
        int n = 30;
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append(
                    String.format("[slot %d] %-"+n+"s%-"+n+"s%n", i,
                            onCommands[i].getClass().getSimpleName(),
                            offCommands[i].getClass().getSimpleName()
                    )
            );
        }
        return stringBuff.toString();
    }
}
