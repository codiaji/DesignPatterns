package io.motassadderoon;

public class Main {
    public static void main(String[] args) {
        LoginDialog loginDialog = new LoginDialog();

        TextBox usernameField = loginDialog.getUsernameField();
        Checkbox rememberMeCheckbox = loginDialog.getRememberMeCheckbox();
        Button loginButton = loginDialog.getLoginButton();

        usernameField.setText("JohnDoe");
        rememberMeCheckbox.toggle();
        loginButton.click();
    }
}