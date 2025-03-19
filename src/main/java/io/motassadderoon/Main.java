package io.motassadderoon;

public class Main {
    public static void main(String[] args) {
        // Creating components
        Amplifier amp = new Amplifier();
        DVDPlayer dvd = new DVDPlayer();
        Projector projector = new Projector();
        Lights lights = new Lights();
        Screen screen = new Screen();

        // Creating the Facade
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, dvd, projector, lights, screen);

        // Watching a movie
        homeTheater.watchMovie("Inception");

        // Stopping the movie
        homeTheater.stopMovie();
    }
}
