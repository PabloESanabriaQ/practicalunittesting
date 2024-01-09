package com.pabloesanabriaq.practicalunittesting.unit3.services;

import com.pabloesanabriaq.practicalunittesting.services.unit3.FahrenheitCelsiusConverter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FahrenheitCelsiusConverterTest {
    private static Stream<Arguments> getTemperatures(){
        return Stream.of(
                Arguments.of(32, 0),
                Arguments.of(99, 37),
                Arguments.of(212, 100)
        );
    }

    @ParameterizedTest
    @MethodSource("getTemperatures")
    public void shouldConvertCelsiusToFahrenheit(Integer fahrenheit, Integer celsius) {
        assertEquals(fahrenheit, FahrenheitCelsiusConverter.toFahrenheit(celsius));
    }

    @ParameterizedTest
    @MethodSource("getTemperatures")
    public void shouldConvertFahrenheitToCelsius(Integer fahrenheit, Integer celsius) {
        assertEquals(celsius, FahrenheitCelsiusConverter.toCelsius(fahrenheit));
    }
}
