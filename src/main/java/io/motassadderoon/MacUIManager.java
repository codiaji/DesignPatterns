package io.motassadderoon;

public class MacUIManager extends UIManager{
    @Override
    public void createUI() {
        button = new MacButton();
        textBox = new MacTextBox();
    }
}
