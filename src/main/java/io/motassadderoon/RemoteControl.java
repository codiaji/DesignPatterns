package io.motassadderoon;

public class RemoteControl {
    private SmartDevice device;

    public void setDevice(SmartDevice device) {
        this.device = device;
    }

    // A method to invoke the device action
    public void pressButton() {
        device.executeAction();
    }
}
