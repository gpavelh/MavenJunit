package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.Stream;

public class ParamTest extends Assertions {
    private static final Logger LOG = LoggerFactory.getLogger(ParamTest.class);

    static Stream<Arguments> localParameters() {
        return Stream.of(
                Arguments.of("A", "B", "AB"),
                Arguments.of("C", "D", "CD"),
                Arguments.of("X", "C", "XC"));
    }

    @DisplayName("ParamTest")
    @ParameterizedTest
    @MethodSource("localParameters")
    public void paramTest1(String valueA, String valueB, String result) {
        assertEquals(result, valueA + valueB);
        LOG.info("All good");
    }
}
