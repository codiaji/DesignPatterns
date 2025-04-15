package io.motassadderoon;

public class WindowsUIManager extends UIManager{
    @Override
    public void createUI() {
        button = new WindowsButton();
        textBox = new WindowsTextBox();
    }
}
