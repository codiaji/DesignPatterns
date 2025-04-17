package io.motassadderoon;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        LegacyRectangle legacyRect = new LegacyRectangle();
        LegacyRectangleAdapter legacyRectangleAdapter=new LegacyRectangleAdapter(legacyRect);
        editor.addShape(legacyRectangleAdapter);

        editor.renderAll();
    }
}