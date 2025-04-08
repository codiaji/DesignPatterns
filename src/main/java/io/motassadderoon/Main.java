package io.motassadderoon;

public class Main {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer( new StoppedState());
        player.pressStop();
        player.pressPlay();
        player.pressPlay();
        player.pressPause();
        player.pressPause();
        player.pressPlay();
        player.pressStop();
        player.pressStop();
    }
}
