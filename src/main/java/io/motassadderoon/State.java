package io.motassadderoon;

public interface State {
    void pressPlay(MusicPlayer musicPlayer);
    void pressPause(MusicPlayer musicPlayer);
    void pressStop(MusicPlayer musicPlayer);
}
