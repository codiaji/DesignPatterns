package io.motassadderoon;

class LoginDialog implements Mediator {
    private final Button loginButton;
    private final TextBox usernameField;
    private final Checkbox rememberMeCheckbox;

    public LoginDialog() {
        this.loginButton = new Button(this);
        this.usernameField = new TextBox(this);
        this.rememberMeCheckbox = new Checkbox(this);
    }

    public Button getLoginButton() {
        return loginButton;
    }

    public TextBox getUsernameField() {
        return usernameField;
    }

    public Checkbox getRememberMeCheckbox() {
        return rememberMeCheckbox;
    }

    @Override
    public void notify(Component sender, String event) {
        if (sender == loginButton && event.equals("click")) {
            if (usernameField.getText().isEmpty()) {
                System.out.println("Dialog: Cannot login, username is empty!");
            } else {
                System.out.println("Dialog: Logging in user: " + usernameField.getText());
                if (rememberMeCheckbox.isChecked()) {
                    System.out.println("Dialog: Saving login info");
                }
            }
        } else if (sender == rememberMeCheckbox && event.equals("toggle")) {
            System.out.println("Dialog: Remember Me option changed.");
        }
    }
}
