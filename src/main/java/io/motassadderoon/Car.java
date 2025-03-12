package io.motassadderoon;

public class Car extends Vehicle {

    public Car(int speed) {
        super(speed);
    }

    public Car(Vehicle vehicle) {
        super(vehicle.getSpeed());
    }

    @Override
    public Car clone() {
        return new Car(this);
    }
}
