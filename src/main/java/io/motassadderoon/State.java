package io.motassadderoon;

public abstract class State {
    protected boolean playing;
    protected boolean paused;

    public State(boolean playing, boolean paused) {
        this.paused = paused;
        this.playing = playing;
    }
    public abstract void pressPlay();
    public abstract void pressPause();
    public abstract void pressStop();
}
