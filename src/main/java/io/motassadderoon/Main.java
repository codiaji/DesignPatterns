package io.motassadderoon;

public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.addDot(10, 20);
        canvas.addCircle(30, 40, 15);
        canvas.addRectangle(50, 60, 20, 30);
        canvas.drawAll();
    }
}