package io.motassadderoon;

public class UIManager {
    public void createUI(String osType) {
        if (osType.equals("Windows")) {
            WindowsButton button = new WindowsButton();
            WindowsTextBox textBox = new WindowsTextBox();
            button.render();
            textBox.render();
        } else if (osType.equals("Mac")) {
            MacButton button = new MacButton();
            MacTextBox textBox = new MacTextBox();
            button.render();
            textBox.render();
        } else if (osType.equals("Linux")) {
            LinuxButton button = new LinuxButton();
            LinuxTextBox textBox = new LinuxTextBox();
            button.render();
            textBox.render();
        }
    }
}