package io.motassadderoon;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomerRepositoryTest {

    @Test
    void testFindCustomerExists() {
        AbstractCustomer customer = CustomerRepository.findCustomerByName("Ea7");
        assertNotNull(customer, "Customer should not be null");
        assertFalse(customer.isNull());
        assertEquals("Ea7", customer.getName(), "Customer name should be Ea7");
    }

    @Test
    void testFindCustomerNotExists() {
        AbstractCustomer customer = CustomerRepository.findCustomerByName("Ea10");
        assertTrue(customer.isNull());
        assertEquals(customer.getName(), "Customer Not Found");
    }
}
