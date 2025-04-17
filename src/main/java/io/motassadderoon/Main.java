package io.motassadderoon;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        LegacyRectangle legacyRect = new LegacyRectangle();

        // This won't work because LegacyRectangle doesn't implement Shape
        // editor.addShape(legacyRect);

        editor.renderAll();
    }
}