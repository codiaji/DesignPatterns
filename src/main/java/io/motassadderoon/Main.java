package io.motassadderoon;

public class Main {
    public static void main(String[] args) {
        Customer customer = CustomerRepository.findByName("Charlie");

        // This requires a null check to avoid NullPointerException
        if (customer != null) {
            System.out.println("Customer Name: " + customer.getName());
        } else {
            System.out.println("Customer not found!");
        }
    }
}