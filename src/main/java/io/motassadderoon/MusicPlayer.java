package io.motassadderoon;

public class MusicPlayer {
    private State state;

    public MusicPlayer(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void pressPlay() {
        state.pressPlay();
        setState(new PlayingState());
    }

    public void pressPause() {
        state.pressPause();
        setState(new PausedState());
    }

    public void pressStop() {
        state.pressStop();
        setState(new StoppedState());
    }
}
