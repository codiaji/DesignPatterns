package io.motassadderoon;

public class LegacyRectangleAdapter implements Shape{
    private final LegacyRectangle legacyRectangle;

    public LegacyRectangleAdapter(LegacyRectangle legacyRectangle) {
        this.legacyRectangle = legacyRectangle;
    }

    @Override
    public void draw(int x, int y, int width, int height) {
        legacyRectangle.display(x, y, x+width, y+height);
    }
}
