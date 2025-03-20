package io.motassadderoon;

public class Fan implements SmartDevice {
    @Override
    public void executeAction() {
        System.out.println("Fan is turned on.");
    }
}
