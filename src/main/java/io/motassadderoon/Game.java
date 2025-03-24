package io.motassadderoon;

public class Game {
    private int level;
    private int score;

    public Game() {
        this.level = 1;
        this.score = 0;
    }

    public void play() {
        level++;
        score += 10;
        System.out.println("Playing game: Level " + level + ", Score " + score);
    }

    public void save() {
        // Save the current state of the game manually.
        System.out.println("Saving Game: Level " + level + ", Score " + score);
    }

    public void load() {
        // Load the game manually, but there is no saved state yet.
        System.out.println("Loading Game...");
        this.level = 1;
        this.score = 0;
        System.out.println("Loaded Game: Level " + level + ", Score " + score);
    }

    public void displayState() {
        System.out.println("Current State: Level " + level + ", Score " + score);
    }
}
