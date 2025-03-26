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

    public void loadState(GameMemento memento) {
        this.level = memento.getLevel();
        this.score = memento.getScore();
        System.out.println("Game State Loaded: Level " + level + ", Score " + score);
    }

    public void displayState() {
        System.out.println("Current State: Level " + level + ", Score " + score);
    }

    public int getLevel() {
        return level;
    }

    public int getScore() {
        return score;
    }
}
