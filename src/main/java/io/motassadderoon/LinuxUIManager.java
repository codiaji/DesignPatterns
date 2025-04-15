package io.motassadderoon;

public class LinuxUIManager extends UIManager{
    @Override
    public void createUI() {
        button = new LinuxButton();
        textBox = new LinuxTextBox();
    }
}
