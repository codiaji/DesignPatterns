package io.motassadderoon;

public class Canvas {
    private final CompoundGraphic compoundGraphic= new CompoundGraphic();
    
    public void add(Graphic graphic) {
        compoundGraphic.add(graphic);
    }

    public void drawAll() {
       compoundGraphic.draw();
    }
}