package week8.commands;


/**
 * Interface for all command objects
 */
@FunctionalInterface
public interface Command {
    /**
     * Method called by the invoker to execute the
     * actions of the receiver.
     */
    void execute();

    /**
     *
     */
}
