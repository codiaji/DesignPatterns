package io.motassadderoon;

public class Main {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        DVDPlayer dvd = new DVDPlayer();
        Projector projector = new Projector();
        Lights lights = new Lights();
        Screen screen = new Screen();

        // Watching a movie manually
        System.out.println("Getting ready to watch a movie...");
        lights.dim(10);
        screen.down();
        projector.on();
        projector.setInput(dvd);
        amp.on();
        amp.setVolume(5);
        dvd.on();
        dvd.play("Inception");

        // Stopping the movie manually
        System.out.println("\nStopping the movie...");
        dvd.off();
        amp.off();
        projector.off();
        screen.up();
        lights.on();
    }
}
