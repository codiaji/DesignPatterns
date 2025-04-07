package io.motassadderoon;

public class BitcoinPayment implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Processing BitcoinPayment payment of $" + amount);
    }
}
