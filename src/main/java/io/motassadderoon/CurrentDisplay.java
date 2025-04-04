package io.motassadderoon;

public class CurrentDisplay implements Display {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Current conditions: " + temperature + "°C, " + humidity + "% humidity");
    }
}
