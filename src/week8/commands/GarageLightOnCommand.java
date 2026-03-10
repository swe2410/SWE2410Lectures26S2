package week8.commands;

import week8.appliances.GarageDoor;

public class GarageLightOnCommand implements Command {
    private GarageDoor garageDoor;
    public GarageLightOnCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }
    public void execute() {
        garageDoor.lightOn();
    }
}
