package week8.commands;

import week8.appliances.Stereo;

public class StereoOnWithCDCommand implements Command {
    private Stereo stereo;
    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
