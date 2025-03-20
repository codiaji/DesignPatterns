package io.motassadderoon;

public class Main {
    public static void main(String[] args) {
        Server server = new Server();

        server.handleRequest();
        server.setRequest(new HttpRequest());
        server.handleRequest();
        server.setRequest(new FtpRequest());
        server.handleRequest();

    }
}
