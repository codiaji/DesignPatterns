package io.motassadderoon;

public class Computer {
    private final String cpu;
    private final String ram;
    private final String storage;
    private final String graphicsCard;
    private final boolean hasWifi;
    private final boolean hasBluetooth;

    public Computer(String cpu, String ram, String storage, String graphicsCard, boolean hasWifi, boolean hasBluetooth) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.graphicsCard = graphicsCard;
        this.hasWifi = hasWifi;
        this.hasBluetooth = hasBluetooth;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", hasWifi=" + hasWifi +
                ", hasBluetooth=" + hasBluetooth +
                '}';
    }
}