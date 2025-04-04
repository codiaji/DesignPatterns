package io.motassadderoon;

public class CurrentDisplay implements Observer {
    private float temperature;
    private float humidity;
    private float pressure;
    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    private void display() {
        System.out.println("Current conditions: " + temperature + "°C, " + humidity + "% humidity");
    }
}
