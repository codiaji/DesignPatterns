package io.motassadderoon;

public class StatisticsDisplay implements Display {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Statistics: Temp=" + temperature + ", Humidity=" + humidity);
    }
}
