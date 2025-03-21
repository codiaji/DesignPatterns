package io.motassadderoon;

public abstract class Command {
    protected SmartDevice smartDevice;

    public Command(SmartDevice smartDevice) {
        this.smartDevice = smartDevice;
    }

    public abstract void execute();
    public abstract void undo();
}
