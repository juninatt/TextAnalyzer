package se.pbt.textanalyzer.implementation;


import se.pbt.textanalyzer.annotations.TextAnalyzerLabel;
import se.pbt.textanalyzer.spi.TextAnalyzer;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Implementation of {@link TextAnalyzer} that counts the number of unique words in a given text.
 * <p>
 * This class makes use of the Java HashSet to identify unique words.
 * Words are considered to be separated by whitespace.
 * </p>
 */
@TextAnalyzerLabel(name = "Unique Word Counter")
public class UniqueWordCounter implements TextAnalyzer {

    /**
     * Analyzes a given text and returns the number of unique words.
     * <p>
     * This method uses Java HashSet to keep track of unique words.
     * If the input text is null or empty, the method returns 0.
     * </p>
     *
     * @param text the text to analyze
     * @return the total number of unique words in the text
     */
    @Override
    public int analyze(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }

        Set<String> uniqueWords = new HashSet<>();
        Collections.addAll(uniqueWords, text.trim()
                .split("\\s+"));
        return uniqueWords.size();
    }
}

