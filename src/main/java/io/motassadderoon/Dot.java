package io.motassadderoon;

public class Dot implements Graphic {
    private final int x;
    private final int y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a dot at (" + x + ", " + y + ")");
    }
}