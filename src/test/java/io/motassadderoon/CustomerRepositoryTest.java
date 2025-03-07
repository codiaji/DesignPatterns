package io.motassadderoon;


import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class CustomerRepositoryTest {

    @Test
    void testGetAllMethod() {
        List<Customer> customers= CustomerRepository.getAll();
        assertEquals(customers.size(),2);
    }

    @Test
    void findExistentCustomer() {
        Customer customer=CustomerRepository.findByName("Ae10");
        assertNotNull(customer);
        assertEquals("Ae10", customer.getName());
    }

    @Test
    void findNotExistentCustomer() {
        Customer customer=CustomerRepository.findByName("Ae7");
        assertNull(customer);
    }
}
