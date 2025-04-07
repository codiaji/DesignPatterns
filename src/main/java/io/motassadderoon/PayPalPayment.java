package io.motassadderoon;

public class PayPalPayment implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Processing PayPalPayment payment of $" + amount);
    }
}
