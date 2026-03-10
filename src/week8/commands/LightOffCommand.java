package week8.commands;

import week8.appliances.Light;

/**
 * Class that turns the referenced light off
 */
public class LightOffCommand implements Command {
    private final Light light;
    /**
     * Creates a new LightOffCommand that will act on the
     * passed-in light
     * @param light Light object that will be turned off
     */
    public LightOffCommand(Light light) {
        this.light = light;
    }
    /**
     * Method called by the invoker to execute the
     * actions of the receiver.
     */
    public void execute() {
        light.off();
    }
}
