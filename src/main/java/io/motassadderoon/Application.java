package io.motassadderoon;

public class Application {
    private final Button button;
    private final TextBox textBox;

    public Application(UIFactory factory) {
        button = factory.createButton();
        textBox = factory.createTextBox();
    }

    public void render() {
        button.render();
        textBox.render();
    }
}