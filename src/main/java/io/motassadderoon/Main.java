package io.motassadderoon;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();

        // Playing the game and saving the state.
        game.play();
        game.save();

        // Continue playing and saving the state again.
        game.play();
        game.save();

        // Load the game (not saved yet).
        game.load();
        game.displayState();

        // Continue playing.
        game.play();
        game.displayState();
    }
}
