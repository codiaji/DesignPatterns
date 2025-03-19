package io.motassadderoon;

class TextBox {
    private final Dialog dialog;
    private String text = "";

    public TextBox(Dialog dialog) {
        this.dialog = dialog;
    }

    public void setText(String text) {
        this.text = text;
        System.out.println("TextBox: Setting text to '" + text + "'");
        dialog.notify("textbox_updated");
    }

    public String getText() {
        return text;
    }
}