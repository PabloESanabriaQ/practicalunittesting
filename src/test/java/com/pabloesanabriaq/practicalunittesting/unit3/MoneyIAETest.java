package com.pabloesanabriaq.practicalunittesting.unit3;

import com.pabloesanabriaq.practicalunittesting.models.Money;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertThrows;

/*
    Practical Unit Testing with JUnit and Mockito - Page 29
 */

public class MoneyIAETest {

    private final static int VALID_AMOUNT = 5;
    private final static String VALID_CURRENCY = "USD";
    private static Object[] getInvalidAmount() {
        return new Integer[][]{{-12387}, {-5}, {-1}};
    }

    @ParameterizedTest
    @MethodSource("getInvalidAmount")
    public void constructorShouldThrowIAEForInvalidAmount(
            int invalidAmount) {
        assertThrows(IllegalArgumentException.class, () -> new Money(invalidAmount, VALID_CURRENCY));
    }
    private static Object[] getInvalidCurrency() {
        return new String[][]{{null}, {""}};
    }

    @ParameterizedTest()
    @MethodSource("getInvalidCurrency")
    public void constructorShouldThrowIAEForInvalidCurrency(
            String invalidCurrency) {
        assertThrows(IllegalArgumentException.class, () -> new Money(VALID_AMOUNT, invalidCurrency));
    }
}
