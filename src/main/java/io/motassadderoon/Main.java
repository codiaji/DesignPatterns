package io.motassadderoon;

public class Main {
    public static void main(String[] args) {
        AbstractCustomer realCustomer = CustomerRepository.findCustomerByName("Charlie");

        System.out.println(realCustomer.getName());
    }
}