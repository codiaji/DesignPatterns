package io.motassadderoon;

public class ForecastDisplay implements Display {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Forecast updated based on pressure: " + pressure);
    }
}
