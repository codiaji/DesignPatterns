package io.motassadderoon;

public class GameCaretaker {
    private GameMemento memento;

    public void save(Game game) {
        memento = new GameMemento(game.getLevel(), game.getScore());
    }

    public void restore(Game game) {
        game.loadState(memento);
    }
}
