package io.motassadderoon;

public class LinuxUIFactory implements UIFactory {
    public Button createButton() {
        return new LinuxButton();
    }
    public TextBox createTextBox() {
        return new LinuxTextBox();
    }
}