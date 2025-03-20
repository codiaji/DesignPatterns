package io.motassadderoon;

public class Light implements SmartDevice {
    @Override
    public void executeAction() {
        System.out.println("Light is turned on.");
    }
}
