package io.motassadderoon;

public class Main {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();
        service.processPayment("credit", 100.0);
        service.processPayment("paypal", 55.5);
        service.processPayment("bitcoin", 250.0);
    }
}
