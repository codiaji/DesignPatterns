package io.motassadderoon;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        GameCaretaker caretaker = new GameCaretaker();

        // Playing the game and saving state
        game.play();
        caretaker.save(game);

        // Playing more and displaying state
        game.play();
        game.displayState();

        // Restore to previous saved state
        caretaker.restore(game);
        game.displayState();
    }
}
