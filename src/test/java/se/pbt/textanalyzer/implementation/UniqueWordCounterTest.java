package se.pbt.textanalyzer.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniqueWordCounterTest {

    @Test
    public void testAnalyze_EmptyString_ReturnsZero() {
        UniqueWordCounter uniqueWordCounter = new UniqueWordCounter();
        int result = uniqueWordCounter.analyze("");
        assertEquals(0, result);
    }

    @Test
    public void testAnalyze_NonEmptyString_ReturnsUniqueWordCount() {
        UniqueWordCounter uniqueWordCounter = new UniqueWordCounter();
        int result = uniqueWordCounter.analyze("Hello World World");
        assertEquals(2, result);
    }
}
