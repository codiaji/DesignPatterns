package io.motassadderoon;

public class Main {
    public static void main(String[] args) {
        Notifier notifier = new BasicNotifier();
        notifier = new EmailNotifier(notifier);
        notifier = new SMSNotifier(notifier);
        notifier = new PushNotifier(notifier);

        notifier.send("Your order has been shipped!");
    }
}
