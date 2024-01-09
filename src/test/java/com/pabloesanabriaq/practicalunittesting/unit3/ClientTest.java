    package com.pabloesanabriaq.practicalunittesting.unit3;

import com.pabloesanabriaq.practicalunittesting.models.Address;
import com.pabloesanabriaq.practicalunittesting.models.Client;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/*
    First version of the class can be found in the book at page 31:
        - Client object created in each method.
    Second version of the class can be found in the book at page 32:
        - Client object as an instance field.
    Third version of the class can be found in the book at page 33:
        - ClientTest with @Before annotation.
 */

public class ClientTest {
    private Address addressA = new Address("street A");
    private Address addressB = new Address("street B");
    private Client client;
    //Client client = new Client();

    @BeforeEach
    public void setUp(){
        client = new Client();
    }

    @Test
    public void afterCreationShouldHaveNoAddress() {
        //Client client = new Client();
        assertEquals(0, client.getAddresses().size());
    }
    @Test
    public void shouldAllowToAddAddress() {
        //Client client = new Client();
        client.addAddress(addressA);
        assertEquals(1, client.getAddresses().size());
        assertTrue(client.getAddresses().contains(addressA));
    }
    @Test
    public void shouldAllowToAddManyAddresses() {
        //Client client = new Client();
        client.addAddress(addressA);
        client.addAddress(addressB);
        assertEquals(2, client.getAddresses().size());
        assertTrue(client.getAddresses().contains(addressA));
        assertTrue(client.getAddresses().contains(addressB));
    }
}
