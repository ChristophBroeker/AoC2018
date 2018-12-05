package de.christophbroeker;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    @DisplayName("Test aA")
    void compareUnits() {
        String testString = "aA";
        assertEquals("", Main.analyzePolymer(testString));
    }

    @Test
    @DisplayName("Test abBA")
    void compareUnitsOne() {
        String testString = "abBA";
        assertEquals("", Main.analyzePolymer(testString));
    }

    @Test
    @DisplayName("Test aabAAB")
    void compareUnitsSecond() {
        String testString = "aabAAB";
        assertEquals("aabAAB", Main.analyzePolymer(testString));
    }

    @Test
    @DisplayName("Test dabAcCaCBAcCcaDA")
    void compareUnitsThird() {
        String testString = "dabAcCaCBAcCcaDA";
        assertEquals("dabCBAcaDA", Main.analyzePolymer(testString));
    }
}