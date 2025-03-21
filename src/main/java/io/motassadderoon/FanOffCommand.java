package io.motassadderoon;

public class FanOffCommand extends Command {
    public FanOffCommand(SmartDevice smartDevice) {
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
