package io.motassadderoon;

public class FanOnCommand extends Command {
    public FanOnCommand(SmartDevice smartDevice) {
        super(smartDevice);
    }

    @Override
    public void execute() {
        smartDevice.turnOn();
    }

    @Override
    public void undo() {
        smartDevice.turnOff();
    }
}
