package io.motassadderoon;

public class LightOnCommand extends Command {
    public LightOnCommand(SmartDevice smartDevice) {
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
