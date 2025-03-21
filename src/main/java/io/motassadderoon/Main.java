package io.motassadderoon;

public class Main {
    public static void main(String[] args) {
        // Creating devices
        SmartDevice light = new Light();
        SmartDevice fan = new Fan();

        RemoteControl remoteControl = new RemoteControl();

        // Adding commands to the remote control
        remoteControl.addCommand("Light On", new LightOnCommand(light));
        remoteControl.addCommand("Light Off", new LightOffCommand(light));
        remoteControl.addCommand("Fan On", new FanOnCommand(fan));
        remoteControl.addCommand("Fan Off", new FanOffCommand(fan));

        // Pressing buttons
        remoteControl.pressButton("Light On");
        remoteControl.pressButton("Fan On");

        // Undo and Redo functionality
        remoteControl.undoLastCommand();
        remoteControl.redoLastCommand();
    }
}
