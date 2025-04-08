package io.motassadderoon;

public class StoppedState implements State{
    @Override
    public void pressPlay(MusicPlayer musicPlayer) {
        System.out.println("Music started playing.");
        musicPlayer.setState(new PlayingState());
    }

    @Override
    public void pressPause(MusicPlayer musicPlayer) {
        System.out.println("Nothing is playing to pause.");
    }

    @Override
    public void pressStop(MusicPlayer musicPlayer) {
        System.out.println("Music is already stopped.");
    }
}
