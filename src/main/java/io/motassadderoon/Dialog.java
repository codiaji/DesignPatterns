package io.motassadderoon;

class Dialog {
    Button loginButton;
    TextBox usernameField;
    Checkbox rememberMeCheckbox;

    public Dialog() {
        this.loginButton = new Button(this);
        this.usernameField = new TextBox(this);
        this.rememberMeCheckbox = new Checkbox(this);
    }

    public void notify(String event) {
        if (event.equals("button_clicked")) {
            if (usernameField.getText().isEmpty()) {
                System.out.println("Dialog: Cannot login, username is empty!");
            } else {
                System.out.println("Dialog: Logging in user: " + usernameField.getText());
                if (rememberMeCheckbox.isChecked()) {
                    System.out.println("Dialog: Saving login info");
                }
            }
        } else if (event.equals("checkbox_toggled")) {
            System.out.println("Dialog: Remember Me option changed.");
        }
    }
}
