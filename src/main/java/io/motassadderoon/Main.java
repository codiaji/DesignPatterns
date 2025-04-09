package io.motassadderoon;

public class Main {
    public static void main(String[] args) {
        Handler loggingHandler = new LoggingHandler();
        Handler authenticationHandler = new AuthenticationHandler();
        Handler authorizationHandler = new AuthorizationHandler();

        // Set up the chain
        loggingHandler.setNext(authenticationHandler);
        authenticationHandler.setNext(authorizationHandler);

        // Create a request
        Request request = new Request("GET /dashboard");

        // Start the chain
        loggingHandler.handle(request);
    }
}
