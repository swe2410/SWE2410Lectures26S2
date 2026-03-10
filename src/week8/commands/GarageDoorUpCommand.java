package week8.commands;

import week8.appliances.GarageDoor;

public class GarageDoorUpCommand implements Command {
    private GarageDoor garageDoor;
    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }
    public void execute() {
        garageDoor.up();
    }
}
