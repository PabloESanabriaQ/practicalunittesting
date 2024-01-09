package com.pabloesanabriaq.practicalunittesting.unit3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.HashMap;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HashMapTest {

    private HashMap<Integer, String> hashMap;

    private static Stream<Arguments> getKeysAndValues() {
        return Stream.of(
                Arguments.of(10, "hello"),
                Arguments.of(20, "world"),
                Arguments.of(null, null)
        );
    }

    @BeforeEach
    public void setUp(){
        hashMap = new HashMap<>();
    }

    @ParameterizedTest
    @MethodSource("getKeysAndValues")
    public void shouldGetValues(Integer key, String value){
        hashMap.put(key, value);

        assertEquals(value, hashMap.get(key));
    }

    @ParameterizedTest
    @MethodSource("getKeysAndValues")
    public void shouldReplaceOldValue(Integer key, String value){
        hashMap.put(key, value);

        hashMap.put(key, "hi");

        assertEquals("hi", hashMap.get(key));
    }

    @Test
    public void shouldBeEmptyWhenUsingClear(){
        hashMap.put(10, "hello");
        hashMap.put(20, "world");
        hashMap.put(null, "123");

        hashMap.clear();

        assertEquals(0, hashMap.size());
    }

}
