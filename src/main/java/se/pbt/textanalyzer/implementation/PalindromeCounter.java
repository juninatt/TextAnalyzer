package se.pbt.textanalyzer.implementation;

import se.pbt.textanalyzer.annotations.TextAnalyzerLabel;
import se.pbt.textanalyzer.spi.TextAnalyzer;

import java.util.Arrays;

@TextAnalyzerLabel(name = "Palindrome Counter")
public class PalindromeCounter implements TextAnalyzer {

    @Override
    public int analyze(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }
        return (int) Arrays.stream(text.split("\\s+"))
                .filter(word -> word.equals(new StringBuilder(word).reverse().toString()))
                .count();
    }
}
