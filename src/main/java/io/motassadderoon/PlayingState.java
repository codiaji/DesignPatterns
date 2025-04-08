package io.motassadderoon;

public class PlayingState implements State {


    @Override
    public void pressPlay(MusicPlayer musicPlayer) {
        System.out.println("Music is already playing.");
    }

    @Override
    public void pressPause(MusicPlayer musicPlayer) {
        System.out.println("Music paused.");
        musicPlayer.setState(new PausedState());
    }

    @Override
    public void pressStop(MusicPlayer musicPlayer) {
        System.out.println("Music stopped.");
        musicPlayer.setState(new StoppedState());
    }
}
