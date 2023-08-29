package se.pbt.textanalyzer.implementation;


import se.pbt.textanalyzer.annotations.TextAnalyzerLabel;
import se.pbt.textanalyzer.spi.TextAnalyzer;

/**
 * Implementation of TextAnalyzer that counts the total number of words in a given text.
 * <p>
 * Words are considered to be separated by whitespace.
 * </p>
 */
@TextAnalyzerLabel(name = "Word Counter")
public class WordCounter implements TextAnalyzer {

    /**
     * Analyzes a given text and returns the total number of words.
     * <p>
     * If the input text is null or empty, the method returns 0.
     * </p>
     *
     * @param text the text to analyze
     * @return the total number of words in the text
     */
    @Override
    public int analyze(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }
        return text.split("\\s+").length;
    }
}

