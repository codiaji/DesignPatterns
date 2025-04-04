package io.motassadderoon;

public class WeatherStation {
    private float temperature;
    private float humidity;
    private float pressure;

    private final Display currentDisplay;
    private final Display statisticsDisplay;
    private final Display forecastDisplay;

    public WeatherStation() {
        currentDisplay = new CurrentDisplay();
        statisticsDisplay = new StatisticsDisplay();
        forecastDisplay = new ForecastDisplay();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        updateDisplays();
    }

    private void updateDisplays() {
        currentDisplay.update(temperature, humidity, pressure);
        statisticsDisplay.update(temperature, humidity, pressure);
        forecastDisplay.update(temperature, humidity, pressure);
    }
}
