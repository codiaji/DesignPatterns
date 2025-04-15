package io.motassadderoon;

public class ErrorHandler extends Handler {
    @Override
    protected boolean process(Request request) {
        System.out.println("ErrorHandler: Could not process request of type '" + request.getType() + "'");
        return true;
    }
}
