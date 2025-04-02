package io.motassadderoon;

public class ShapeRender implements Visitor{


    @Override
    public void render(Circle circle) {
        System.out.println("Rendering Circle");
    }

    @Override
    public void render(Rectangle rectangle) {
        System.out.println("Rendering Rectangle");
    }
}
