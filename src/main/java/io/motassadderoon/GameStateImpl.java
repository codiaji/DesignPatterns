package io.motassadderoon;

public class GameStateImpl extends GameState{
    private int level;
    private int score;
    private int savedLevel;
    private int savedScore;

    public GameStateImpl() {
        this.score = 0;
        this.level = 1;
        this.savedScore=0;
        this.savedLevel=1;
    }

    @Override
    public void play() {
        level++;
        score += 10;
        System.out.println("Playing game: Level " + level + ", Score " + score);

    }

    @Override
    public void save() {
        this.savedLevel=this.level;
        this.savedScore=this.score;
        System.out.println("Saving Game: Level " + level + ", Score " + score);
    }

    @Override
    public void load() {
        System.out.println("Loading Game...");
        this.level=this.savedLevel;
        this.score=this.savedScore;
        System.out.println("Loaded Game: Level " + level + ", Score " + score);
    }

    @Override
    public void displayState() {
        System.out.println("Current State: Level " + level + ", Score " + score);
    }
}
