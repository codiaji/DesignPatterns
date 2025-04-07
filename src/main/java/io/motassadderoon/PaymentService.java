package io.motassadderoon;

public class PaymentService {
    public void processPayment(String method, double amount) {
        if (method.equalsIgnoreCase("credit")) {
            System.out.println("Processing credit card payment of $" + amount);
        } else if (method.equalsIgnoreCase("paypal")) {
            System.out.println("Processing PayPal payment of $" + amount);
        } else if (method.equalsIgnoreCase("bitcoin")) {
            System.out.println("Processing Bitcoin payment of $" + amount);
        } else {
            System.out.println("Unsupported payment method.");
        }
    }
}
