package io.motassadderoon;

class Checkbox {
    private final Dialog dialog;
    private boolean checked;

    public Checkbox(Dialog dialog) {
        this.dialog = dialog;
        this.checked = false;
    }

    public void toggle() {
        checked = !checked;
        System.out.println("Checkbox toggled: " + (checked ? "Remember Me Checked" : "Remember Me Unchecked"));
        dialog.notify("checkbox_toggled");
    }

    public boolean isChecked() {
        return checked;
    }
}