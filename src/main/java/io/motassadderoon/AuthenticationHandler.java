package io.motassadderoon;

public class AuthenticationHandler extends Handler {
    @Override
    protected void handleRequest(Request request) {
        System.out.println("Logging request: " + request.content());
    }
}
