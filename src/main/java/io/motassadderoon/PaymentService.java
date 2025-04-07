package io.motassadderoon;

public class PaymentService {
    PaymentMethod paymentMethod;

    public PaymentService(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void processPayment(double amount) {
        if (paymentMethod != null) {
            paymentMethod.pay(amount);
        } else {
            System.out.println("Unsupported payment method.");
        }
    }
}
