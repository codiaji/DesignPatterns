package io.motassadderoon;

import java.util.*;

public class CustomerRepository {
    private static final List<AbstractCustomer> customers = Arrays.asList(
            new RealCustomer("Ae10"),
            new RealCustomer("Ea7")
    );

    public static AbstractCustomer findCustomerByName(String name) {
        return customers.stream()
                .filter(c -> c.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(new NullCustomer());
    }
}
