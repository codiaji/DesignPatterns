package io.motassadderoon;

public class Main {
    public static void main(String[] args) {
        PaymentService service = new PaymentService(new CreditCardPayment());
        service.processPayment(100.0);

        service.setPaymentMethod(new PayPalPayment());
        service.processPayment(200.0);

        service.setPaymentMethod(new BitcoinPayment());
        service.processPayment(300.0);
    }
}
