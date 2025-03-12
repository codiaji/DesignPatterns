package io.motassadderoon;

public class Truck extends Vehicle{

    public Truck(int speed) {
        super(speed);
    }

    public Truck(Vehicle vehicle) {
        super(vehicle.getSpeed());
    }

    @Override
    public Truck clone() {
        return new Truck(this);
    }
}
