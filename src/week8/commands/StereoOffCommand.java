package week8.commands;

import week8.appliances.Stereo;

public class StereoOffCommand implements Command {
    private Stereo stereo;
    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }
    public void execute() {
        stereo.off();
    }
}
