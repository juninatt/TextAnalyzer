package se.pbt.textanalyzer.implementation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniqueWordCounterTest {

    @Test
    @DisplayName("Test empty string input")
    public void testAnalyze_withInputEmptyString() {
        UniqueWordCounter uniqueWordCounter = new UniqueWordCounter();
        int result = uniqueWordCounter.analyze("");
        assertEquals(0, result);
    }

    @Test
    @DisplayName("Test non-empty string with repeated words")
    public void testAnalyze_inputWithRepeatedWords() {
        UniqueWordCounter uniqueWordCounter = new UniqueWordCounter();
        int result = uniqueWordCounter.analyze("Hello World World");
        assertEquals(2, result);
    }

    @Test
    @DisplayName("Test null input")
    public void testAnalyze_withNullInput() {
        UniqueWordCounter uniqueWordCounter = new UniqueWordCounter();
        int result = uniqueWordCounter.analyze(null);
        assertEquals(0, result);
    }

    @Test
    @DisplayName("Test string with special characters")
    public void testAnalyze_inputWithSpecialCharacters() {
        UniqueWordCounter uniqueWordCounter = new UniqueWordCounter();
        int result = uniqueWordCounter.analyze("Hello! World, World? Hello.");
        assertEquals(2, result);
    }
}
