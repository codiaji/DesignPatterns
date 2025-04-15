package io.motassadderoon;

public class AuthHandler extends Handler {
    @Override
    protected boolean process(Request request) {
        if (request.getType().equals("auth")) {
            System.out.println("AuthHandler processed: " + request.getContent());
            return true;
        }
        return false;
    }
}
