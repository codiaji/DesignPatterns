package io.motassadderoon;

public class BasicNotifier implements Notifier{


    public void send(String message) {
        System.out.println("Basic Notification: " + message);
    }
}
