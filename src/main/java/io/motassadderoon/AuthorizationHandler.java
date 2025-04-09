package io.motassadderoon;

public class AuthorizationHandler extends Handler {
    @Override
    protected void handleRequest(Request request) {
        System.out.println("Processing data: " + request.content());
    }
}
