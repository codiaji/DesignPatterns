package io.motassadderoon;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        Observer currentDisplay=new CurrentDisplay();
        weatherStation.addObserver(currentDisplay);
        Observer statisticsDisplay=new StatisticsDisplay();
        weatherStation.addObserver(statisticsDisplay);
        Observer forecastDisplay=new ForecastDisplay();
        weatherStation.addObserver(forecastDisplay);
        weatherStation.removeObserver(statisticsDisplay);
        // Simulate new weather measurements
        weatherStation.setMeasurements(25.3f, 65.0f, 1013.1f);
        weatherStation.setMeasurements(26.7f, 70.0f, 1012.5f);
        weatherStation.setMeasurements(24.1f, 60.0f, 1011.8f);
    }
}
