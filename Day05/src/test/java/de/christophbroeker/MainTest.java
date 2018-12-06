package de.christophbroeker;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    @DisplayName("Analyze: aA")
    void analyzePolymer() {
        String testString = "aA";
        assertEquals("", Main.analyzePolymer(testString));
    }

    @Test
    @DisplayName("Analyze: abBA")
    void analyzePolymerOne() {
        String testString = "abBA";
        assertEquals("", Main.analyzePolymer(testString));
    }

    @Test
    @DisplayName("Analyze: aabAAB")
    void analyzePolymerSecond() {
        String testString = "aabAAB";
        assertEquals("aabAAB", Main.analyzePolymer(testString));
    }

    @Test
    @DisplayName("Analyze: dabAcCaCBAcCcaDA")
    void analyzePolymerThird() {
        String testString = "dabAcCaCBAcCcaDA";
        assertEquals("dabCBAcaDA", Main.analyzePolymer(testString));
    }

    @Test
    @DisplayName("Reduce and analyze: dabAcCaCBAcCcaDA")
    void reduceAndAnalyzePolymer() {
        String testString = "dabAcCaCBAcCcaDA";
        assertEquals(4, Main.reduceAndAnalyzePolymer(testString));

    }

}