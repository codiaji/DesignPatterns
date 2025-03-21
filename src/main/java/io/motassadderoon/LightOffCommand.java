package io.motassadderoon;

public class LightOffCommand extends Command {
    public LightOffCommand(SmartDevice smartDevice) {
        super(smartDevice);
    }

    @Override
    public void execute() {
        smartDevice.turnOff();
    }

    @Override
    public void undo() {
        smartDevice.turnOn();
    }
}
