package io.motassadderoon;

public class LoggingHandler extends Handler {
    @Override
    protected boolean process(Request request) {
        if (request.getType().equals("log")) {
            System.out.println("LoggingHandler processed: " + request.getContent());
            return true;
        }
        return false;
    }
}
