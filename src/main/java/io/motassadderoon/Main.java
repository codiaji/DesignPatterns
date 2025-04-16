package io.motassadderoon;

public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();

        Dot dot1 = new Dot(10, 20);
        Circle circle1 = new Circle(30, 40, 15);
        Rectangle rectangle1 = new Rectangle(50, 60, 20, 30);

        CompoundGraphic group1 = new CompoundGraphic();
        group1.add(new Dot(100, 110));
        group1.add(new Circle(120, 130, 10));

        canvas.add(dot1);
        canvas.add(circle1);
        canvas.add(rectangle1);
        canvas.add(group1);

        canvas.drawAll();
    }
}