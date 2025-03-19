package io.motassadderoon;

class Button {
    private final Dialog dialog;

    public Button(Dialog dialog) {
        this.dialog = dialog;
    }

    public void click() {
        System.out.println("Login Button clicked");
        dialog.notify("button_clicked");
    }
}