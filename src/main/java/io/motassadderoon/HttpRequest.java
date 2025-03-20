package io.motassadderoon;

public class HttpRequest implements Request{
    @Override
    public void handleRequest() {
        System.out.println("Handling HTTP request...");
    }
}
