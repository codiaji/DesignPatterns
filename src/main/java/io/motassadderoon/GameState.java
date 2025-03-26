package io.motassadderoon;

public abstract class GameState {
    public abstract void play();
    public abstract void save();
    public abstract void load();
    public abstract void displayState();
}
