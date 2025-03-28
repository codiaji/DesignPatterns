package io.motassadderoon;

public class ShapeRenderer {
    public void render(Shape shape) {
        if (shape instanceof Circle) {
            System.out.println("Rendering Circle");
        } else if (shape instanceof Rectangle) {
            System.out.println("Rendering Rectangle");
        }
    }
}
