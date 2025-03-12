package io.motassadderoon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VehiclePrototypeTest {

    @Test
    void testVehiclePrototypeCreation() {
        Vehicle car=new Car(300);
        Car newCar= (Car) car.clone();
        assertEquals(newCar.getSpeed(),car.getSpeed());
        assertNotEquals(car,newCar);

        Vehicle truck=new Truck(200);
        truck.setSpeed(180);
        Truck newTruck= (Truck)truck.clone();
        assertNotEquals(truck, newTruck);
        assertEquals(truck.getSpeed(),newTruck.getSpeed());

    }
}