package io.motassadderoon;

public class LoggingHandler extends Handler{
    @Override
    protected void handleRequest(Request request) {
        System.out.println("Logging request: " + request.content());
    }
}
