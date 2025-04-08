package io.motassadderoon;

public class Main {
    public static void main(String[] args) {
        RequestProcessor processor = new RequestProcessor();

        processor.handle(new Request("AUTH", "User login"));
        processor.handle(new Request("LOG", "Login timestamp"));
        processor.handle(new Request("DATA", "User profile info"));
    }
}
