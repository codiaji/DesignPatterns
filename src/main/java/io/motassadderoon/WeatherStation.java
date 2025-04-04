package io.motassadderoon;

import java.util.LinkedList;
import java.util.List;

public class WeatherStation implements Subject{
    private float temperature;
    private float humidity;
    private float pressure;

    private final List<Observer> observers;

    public WeatherStation() {
        observers=new LinkedList<>();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }
}
