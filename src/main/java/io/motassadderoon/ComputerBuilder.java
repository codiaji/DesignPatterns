package io.motassadderoon;

public class ComputerBuilder {
    private String cpu;
    private String ram;
    private String storage;
    private String graphicsCard;
    private boolean hasWifi;
    private boolean hasBluetooth;

    public ComputerBuilder cpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public ComputerBuilder ram(String ram) {
        this.ram = ram;
        return this;
    }

    public ComputerBuilder storage(String storage) {
        this.storage = storage;
        return this;
    }

    public ComputerBuilder graphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
        return this;
    }

    public ComputerBuilder HasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
        return this;
    }

    public ComputerBuilder hasBluetooth(boolean hasBluetooth) {
        this.hasBluetooth = hasBluetooth;
        return this;
    }

    public Computer build() {
        return new Computer(cpu,ram,storage,graphicsCard,hasWifi,hasBluetooth);
    }
}
