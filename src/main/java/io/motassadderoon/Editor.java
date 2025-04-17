package io.motassadderoon;

import java.util.ArrayList;
import java.util.List;

public class Editor {
    private final List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void renderAll() {
        for (Shape shape : shapes) {
            shape.draw(0, 0, 100, 50);
        }
    }
}
