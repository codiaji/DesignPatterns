package io.motassadderoon;

public class PausedState extends State{
    public PausedState() {
        super(false, true);
    }
    @Override
    public void pressPlay() {
        System.out.println("Music resumed.");
    }

    @Override
    public void pressPause() {
        System.out.println("Music is already paused.");
    }

    @Override
    public void pressStop() {
        System.out.println("Music stopped.");
    }
}
