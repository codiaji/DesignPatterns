package io.motassadderoon;

public class Main {
    public static void main(String[] args) {
        Dialog loginDialog = new Dialog();
        loginDialog.usernameField.setText("JohnDoe");
        loginDialog.rememberMeCheckbox.toggle();
        loginDialog.loginButton.click();
    }
}