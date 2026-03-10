package week8.remoteV1;

import week8.appliances.CeilingFan;
import week8.appliances.GarageDoor;
import week8.appliances.Light;
import week8.appliances.Stereo;

public class RemoteControl {
    private Light light;
    private GarageDoor garageDoor;
    private CeilingFan ceilingFan;
    private Stereo stereo;

    public RemoteControl() {
        light = new Light("Kitchen");
        garageDoor = new GarageDoor("Garage");
        stereo = new Stereo("Living Room");
        ceilingFan = new CeilingFan("Bed Room");
    }

    public void onButtonWasPushed(int slot) {
        switch (slot) {
            case 0 -> light.on();
            case 1 -> garageDoor.lightOn();
            case 2 -> garageDoor.up();
            case 3 -> ceilingFan.high();
            case 4 -> {
                stereo.on();
                stereo.setCD();
                stereo.setVolume(11);
            }
        }
    }

    public void offButtonWasPushed(int slot) {
        switch (slot) {
            case 0 -> light.off();
            case 1 -> garageDoor.lightOff();
            case 2 -> garageDoor.down();
            case 3 -> ceilingFan.off();
            case 4 -> {
                stereo.on();
                stereo.setCD();
                stereo.setVolume(11);
            }
        }
    }

    public String toString() {
        final int n = 20;
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        stringBuff.append(String.format("[slot %d] %-"+n+"s%-"+n+"s\n", 0, "Light On", "Light Off"));
        stringBuff.append(String.format("[slot %d] %-"+n+"s%-"+n+"s\n", 1, "Garage Light On", "Garage Light Off"));
        stringBuff.append(String.format("[slot %d] %-"+n+"s%-"+n+"s\n", 2, "Garage Door Up", "Garage Door Down"));
        stringBuff.append(String.format("[slot %d] %-"+n+"s%-"+n+"s\n", 3, "Ceiling Fan High", "Ceiling Fan Off"));
        stringBuff.append(String.format("[slot %d] %-"+n+"s%-"+n+"s\n", 4, "Stereo w/ CD On", "Stereo Off"));
        return stringBuff.toString();
    }
}
