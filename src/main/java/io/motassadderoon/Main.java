package io.motassadderoon;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        Visitor renderer = new ShapeRender();
        circle.accept(renderer);
        rectangle.accept(renderer);
    }
}
