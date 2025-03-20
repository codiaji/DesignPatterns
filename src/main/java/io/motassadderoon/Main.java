package io.motassadderoon;

public class Main {
    public static void main(String[] args) {
        Server server = new Server();

        server.handleRequest("HTTP");
        server.handleRequest("FTP");
        server.handleRequest("SSH");
        server.handleRequest("SMTP"); // Unsupported request
    }
}
