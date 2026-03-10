package week8.remoteV2;

import week8.appliances.CeilingFan;
import week8.appliances.GarageDoor;
import week8.appliances.Light;
import week8.appliances.Stereo;
import week8.commands.*;

public class RemoteLoaderLambda {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("Garage");
        Stereo stereo = new Stereo("Living Room");
        Command stereoOnWithCD = () -> {
            stereo.on();
            stereo.setCD();
            stereo.setVolume(11);
        };
        Command[] partyOn = {livingRoomLight::on, ceilingFan::high, stereoOnWithCD};
        Command[] partyOff = {livingRoomLight::off, ceilingFan::off, stereo::off};

        remoteControl.setCommand(0, livingRoomLight::on, livingRoomLight::off);
        remoteControl.setCommand(1, garageDoor::lightOn, garageDoor::lightOff);
        remoteControl.setCommand(2, garageDoor::up, garageDoor::down);
        remoteControl.setCommand(3, ceilingFan::high, ceilingFan::off);
        remoteControl.setCommand(4, stereoOnWithCD, stereo::off);
        remoteControl.setCommand(5, new MacroCommand(partyOn), new MacroCommand(partyOff));

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);
        System.out.println("Party on");
        remoteControl.onButtonWasPushed(5);
        System.out.println("Party off");
        remoteControl.offButtonWasPushed(5);
    }
}
