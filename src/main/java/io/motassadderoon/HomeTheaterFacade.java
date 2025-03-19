package io.motassadderoon;

import static java.lang.System.out;

public class HomeTheaterFacade {
    private final Amplifier amp;
    private final DVDPlayer dvd;
    private final Projector projector;
    private final Lights lights;
    private final Screen screen;

    public HomeTheaterFacade(Amplifier amp, DVDPlayer dvd, Projector projector, Lights lights, Screen screen) {
        this.amp = amp;
        this.dvd = dvd;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
    }

    public void watchMovie(String movieName) {
        out.println("Getting ready to watch a movie...");
        lights.dim(10);
        screen.down();
        projector.on();
        projector.setInput(dvd);
        amp.on();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movieName);
    }

    public void stopMovie() {
        System.out.println("\nStopping the movie...");
        dvd.off();
        amp.off();
        projector.off();
        screen.up();
        lights.on();
    }
}
