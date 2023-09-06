package se.pbt.textanalyzer.implementation;


import se.pbt.textanalyzer.annotations.TextAnalyzerLabel;
import se.pbt.textanalyzer.spi.TextAnalyzer;

import java.util.Arrays;
import java.util.HashSet;

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

        // Replace special characters with space, then trim and split by whitespace
        String[] words = text.replaceAll("[^a-zA-Z ]", " ")
                .trim()
                .split("\\s+");

        var uniqueWords = new HashSet<>(Arrays.asList(words));
        return uniqueWords.size();
    }
}

