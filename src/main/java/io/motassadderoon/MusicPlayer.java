package io.motassadderoon;

public class MusicPlayer {
    private boolean playing = false;
    private boolean paused = false;

    public void pressPlay() {
        if (!playing) {
            playing = true;
            paused = false;
            System.out.println("Music started playing.");
        } else if (paused) {
            paused = false;
            System.out.println("Music resumed.");
        } else {
            System.out.println("Music is already playing.");
        }
    }

    public void pressPause() {
        if (playing && !paused) {
            paused = true;
            System.out.println("Music paused.");
        } else if (paused) {
            System.out.println("Music is already paused.");
        } else {
            System.out.println("Nothing is playing to pause.");
        }
    }

    public void pressStop() {
        if (playing || paused) {
            playing = false;
            paused = false;
            System.out.println("Music stopped.");
        } else {
            System.out.println("Music is already stopped.");
        }
    }
}
