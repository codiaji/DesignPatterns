package io.motassadderoon;

public class Tree {
    private final String type;
    private final String color;
    private final String texture;
    private final int x;
    private final int y;

    public Tree(String type, String color, String texture, int x, int y) {
        this.type = type;
        this.color = color;
        this.texture = texture;
        this.x = x;
        this.y = y;
    }

    public void render() {
        System.out.println("Rendering " + type + " tree at (" + x + ", " + y + ") with color " + color);
    }
}
