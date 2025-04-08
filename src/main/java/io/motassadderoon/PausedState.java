package io.motassadderoon;

public class PausedState implements State{
    @Override
    public void pressPlay(MusicPlayer musicPlayer) {
        System.out.println("Music resumed.");
        musicPlayer.setState(new PlayingState());
    }

    @Override
    public void pressPause(MusicPlayer musicPlayer) {
        System.out.println("Music is already paused.");
    }

    @Override
    public void pressStop(MusicPlayer musicPlayer) {
        System.out.println("Music stopped.");
        musicPlayer.setState(new StoppedState());
    }
}
