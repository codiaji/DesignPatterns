package io.motassadderoon;

public class PlayingState extends State {
    public PlayingState() {
        super(true,false);
    }

    @Override
    public void pressPlay() {
        System.out.println("Music is already playing.");
    }

    @Override
    public void pressPause() {
        System.out.println("Music paused.");
    }

    @Override
    public void pressStop() {
        System.out.println("Music stopped.");
    }
}
