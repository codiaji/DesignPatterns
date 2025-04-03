package io.motassadderoon;

public class BaseTree {
    private final String type;
    private final String color;
    private final String texture;

    public BaseTree(String type, String color, String texture) {
        this.type = type;
        this.color = color;
        this.texture = texture;
    }

    public void render(int x, int y) {
        System.out.println("Rendering " + type + " tree with color " + color +
                " and texture " + texture + " at (" + x + ", " + y + ")");
    }
}
