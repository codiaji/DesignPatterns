package io.motassadderoon;

import java.util.List;
import java.util.ArrayList;

public class Canvas {
    private final List<Object> graphics = new ArrayList<>();

    public void addDot(int x, int y) {
        graphics.add(new Dot(x, y));
    }

    public void addCircle(int x, int y, int radius) {
        graphics.add(new Circle(x, y, radius));
    }

    public void addRectangle(int x, int y, int width, int height) {
        graphics.add(new Rectangle(x, y, width, height));
    }

    public void drawAll() {
        for (Object graphic : graphics) {
            if (graphic instanceof Dot) {
                ((Dot) graphic).draw();
            } else if (graphic instanceof Circle) {
                ((Circle) graphic).draw();
            } else if (graphic instanceof Rectangle) {
                ((Rectangle) graphic).draw();
            }
        }
    }
}