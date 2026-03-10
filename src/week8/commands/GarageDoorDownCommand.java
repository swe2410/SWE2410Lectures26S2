package week8.commands;

import week8.appliances.GarageDoor;

public class GarageDoorDownCommand implements Command {
    private GarageDoor garageDoor;
    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }
    public void execute() {
        garageDoor.up();
    }
}
