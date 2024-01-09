package com.pabloesanabriaq.practicalunittesting.unit3.services;

import com.pabloesanabriaq.practicalunittesting.exceptions.InvalidStringException;
import com.pabloesanabriaq.practicalunittesting.services.unit3.StringReverseService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StringReverseServiceTest {

    private StringReverseService stringReverseService;

    private static Stream<String> getStrings(){
        return Stream.of(
                "hello",
                "world",
                "once",
                "again",
                ""
        );
    }

    @BeforeEach
    public void setUp(){
        stringReverseService = new StringReverseService();
    }

    @ParameterizedTest
    @MethodSource("getStrings")
    public void shouldReverseString(String strToReverse) throws InvalidStringException {

        String reverse = new StringBuilder(strToReverse).reverse().toString();

        assertEquals(reverse, stringReverseService.run(strToReverse));
    }

    @Test
    public void shouldThrowInvalidStringException() throws InvalidStringException {
        assertThrows(InvalidStringException.class, () -> stringReverseService.run(null));
    }
}