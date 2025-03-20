package io.motassadderoon;

public class Server {
    public void handleRequest(String requestType) {
        if (requestType.equalsIgnoreCase("HTTP")) {
            System.out.println("Handling HTTP request...");
        } else if (requestType.equalsIgnoreCase("FTP")) {
            System.out.println("Handling FTP request...");
        } else if (requestType.equalsIgnoreCase("SSH")) {
            System.out.println("Handling SSH request...");
        } else {
            System.out.println("Unknown request type!");
        }
    }
}
