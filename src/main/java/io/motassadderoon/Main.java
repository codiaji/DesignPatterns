package io.motassadderoon;

public class Main {
    public static void main(String[] args) {
        Handler logging = new LoggingHandler();
        Handler auth = new AuthHandler();
        Handler error = new ErrorHandler();

        logging.linkWith(auth).linkWith(error);

        Request logRequest = new Request("log", "User login successful");
        Request authRequest = new Request("auth", "Validate user token");
        Request unknownRequest = new Request("db", "Database error");

        logging.handle(logRequest);
        logging.handle(authRequest);
        logging.handle(unknownRequest);
    }
}
