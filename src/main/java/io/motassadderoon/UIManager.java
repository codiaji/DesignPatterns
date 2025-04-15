package io.motassadderoon;

public abstract class UIManager {
    Component button;
    Component textBox;
    public void render() {
        createUI();
        button.render();
        textBox.render();
    }
    public abstract void createUI();
}