package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class ParamTest extends Assertions {
    private static final Logger LOG = LoggerFactory.getLogger(ParamTest.class);

    private static Object[][] dataProvider() {
        return new Object[][]{
                {"A", "B", "AB"},
                {"C", "D", "CD"},
                {"X", "C", "XC"}
        };
    }

    @DisplayName("ParamTest")
    @ParameterizedTest
    @MethodSource("dataProvider")
    public void paramTest1(String valueA, String valueB, String result) {
        assertEquals(result, valueA + valueB);
        LOG.info("All good");
    }
}
