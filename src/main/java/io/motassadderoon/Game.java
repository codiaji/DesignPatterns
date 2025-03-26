package io.motassadderoon;

public class Game {
    private final GameState gameState;


    public Game() {
        gameState=new GameStateImpl();
    }

    public void play() {

        gameState.play();
    }

    public void save() {
        gameState.save();
    }

    public void load() {
       gameState.load();

    }

    public void displayState() {
        gameState.displayState();
    }
}
