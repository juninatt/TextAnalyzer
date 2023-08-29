package se.pbt.textanalyzer.implementation;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordCounterTest {

    @Test
    public void testAnalyze_EmptyString_ReturnsZero() {
        WordCounter wordCounter = new WordCounter();
        int result = wordCounter.analyze("");
        assertEquals(0, result);
    }

    @Test
    public void testAnalyze_NonEmptyString_ReturnsWordCount() {
        WordCounter wordCounter = new WordCounter();
        int result = wordCounter.analyze("Hello World");
        assertEquals(2, result);
    }
}
