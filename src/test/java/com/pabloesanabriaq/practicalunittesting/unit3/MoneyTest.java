package com.pabloesanabriaq.practicalunittesting.unit3;

import com.pabloesanabriaq.practicalunittesting.models.Money;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
    Practical Unit Testing with JUnit and Mockito - Page 21
 */
class MoneyTest {

    @Test
    public void constructorShouldSetAmountAndCurrency(){
        Money money = new Money(10, "ARS");

        assertEquals(10, money.getAmount());
        assertEquals("ARS", money.getCurrency());
    }

}