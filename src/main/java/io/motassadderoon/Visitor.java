package io.motassadderoon;

public interface Visitor {
    void render(Circle circle);
    void render(Rectangle rectangle);
}
