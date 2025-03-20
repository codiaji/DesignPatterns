package io.motassadderoon;

public class Main {
    public static void main(String[] args) {
        // Creating devices
        SmartDevice light = new Light();
        SmartDevice fan = new Fan();

        // Creating the remote control object
        RemoteControl remoteControl = new RemoteControl();

        // Setting the device on the remote
        remoteControl.setDevice(light);
        remoteControl.pressButton();  // Should turn on the light

        remoteControl.setDevice(fan);
        remoteControl.pressButton();  // Should turn on the fan
    }
}

