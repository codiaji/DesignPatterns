package io.motassadderoon;

public class Server {
    private Request request;

    public void handleRequest() {
        if (request != null) {
            request.handleRequest();
        }
        else {
            System.out.println("No request specified");
        }
    }

    public void setRequest(Request request) {
        this.request = request;
    }
}
