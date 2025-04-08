package io.motassadderoon;

public class RequestProcessor {
    public void handle(Request request) {
        if ("AUTH".equals(request.getType())) {
            System.out.println("Authenticating request: " + request.getContent());
        } else if ("LOG".equals(request.getType())) {
            System.out.println("Logging request: " + request.getContent());
        } else if ("DATA".equals(request.getType())) {
            System.out.println("Processing data: " + request.getContent());
        } else {
            System.out.println("Unknown request type.");
        }
    }
}
