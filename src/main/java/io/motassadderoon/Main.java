package io.motassadderoon;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        ShapeRenderer renderer = new ShapeRenderer();

        renderer.render(circle);
        renderer.render(rectangle);
    }
}
