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
        state.pressPlay(this);
    }

    public void pressPause() {
        state.pressPause(this);
    }

    public void pressStop() {
        state.pressStop(this);
    }
}
