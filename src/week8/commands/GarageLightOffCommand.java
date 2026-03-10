package week8.commands;

import week8.appliances.GarageDoor;

public class GarageLightOffCommand implements Command {
    private GarageDoor garageDoor;
    public GarageLightOffCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }
    public void execute() {
        garageDoor.lightOff();
    }
}
