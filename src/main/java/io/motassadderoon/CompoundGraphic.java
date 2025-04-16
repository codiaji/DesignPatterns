package io.motassadderoon;

import java.util.ArrayList;
import java.util.List;

public class CompoundGraphic implements Graphic{
    private final List<Graphic> graphics = new ArrayList<>();

    public void add(Graphic graphic) {
        graphics.add(graphic);
    }

    @Override
    public void draw() {
        for (Graphic graphic : graphics) {
            graphic.draw();
        }
    }
}
