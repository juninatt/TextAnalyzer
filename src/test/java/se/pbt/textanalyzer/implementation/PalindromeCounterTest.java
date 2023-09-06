package se.pbt.textanalyzer.implementation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PalindromeCounterTest {

    private final PalindromeCounter palindromeCounter = new PalindromeCounter();

    @Test
    @DisplayName("Test null input")
    void testAnalyze_withNullInput() {
        assertEquals(0, palindromeCounter.analyze(null));
    }

    @Test
    @DisplayName("Test empty input")
    void testAnalyze_withEmptyInput() {
        assertEquals(0, palindromeCounter.analyze(""));
    }

    @Test
    @DisplayName("Test input with no palindromes")
    void testAnalyze_inputWithNoPalindromes() {
        assertEquals(0, palindromeCounter.analyze("hello world"));
    }

    @Test
    @DisplayName("Test input with palindromes")
    void testAnalyze_inputWithPalindromes() {
        assertEquals(3, palindromeCounter.analyze("madam racecar level hello"));
    }
}
