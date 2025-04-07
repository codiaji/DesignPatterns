package io.motassadderoon;

public class StoppedState extends State{
    public StoppedState() {
        super(false, false);
    }

    @Override
    public void pressPlay() {
        System.out.println("Music started playing.");
    }

    @Override
    public void pressPause() {
        System.out.println("Nothing is playing to pause.");
    }

    @Override
    public void pressStop() {
        System.out.println("Music is already stopped.");
    }
}
