package io.motassadderoon;

import java.util.*;

public class CustomerRepository {
    private static final List<Customer> customers = Arrays.asList(
            new Customer("Ae10"),
            new Customer("Ea7")
    );
    public static List<Customer> getAll() {
        return customers;
    }

    public static Customer findByName(String name) {
        return customers.stream()
                .filter(c -> c.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }
}
