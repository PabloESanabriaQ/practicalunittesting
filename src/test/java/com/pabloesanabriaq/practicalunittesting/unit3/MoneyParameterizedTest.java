package com.pabloesanabriaq.practicalunittesting.unit3;

import com.pabloesanabriaq.practicalunittesting.models.Money;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
/*
    Practical Unit Testing with JUnit and Mockito - Page 26
 */
public class MoneyParameterizedTest {

    private static Stream<Arguments> getMoney() {
        return Stream.of(
                Arguments.of(10, "USD"),
                Arguments.of(20, "EUR")
                );
    }
    /*
        private static final Object[] getMoney() {
            return new Object[] {
                    new Object[] {10, "USD"},
                    new Object[] {20, "EUR"}
            };
        }
     */

    @ParameterizedTest
    @MethodSource("getMoney")
    public void constructorShouldSetAmountAndCurrency(Integer amount, String currency) {
        Money money = new Money(amount, currency);
        assertEquals(amount, money.getAmount());
        assertEquals(currency, money.getCurrency());
    }

    /*
    Summing up, the advantages of using parameterized tests over any custom code are the following:
        • none of one’s own, potentially flawed, logic is introduced (e.g. for loop),
        • adding another set of arguments is very easy, and does not make the code grow,
        • a single data-providing method can be used to feed multiple test methods (and can do so across
            multiple test classes), making the code even more concise,
        • there is no copy&paste coding, there are no "global" variables, and the DRY principle is faithfully
            honored,
        • there is a clear separation between test logic (how the code is expected to work) and test data (what
            values are tested),
        • we get more detailed results of the tests’ execution.
     */

}
