package se.pbt.textanalyzer.spi;

/**
 * A Text Analyzer interface for analyzing textual data.
 * <p>
 * Implementations of this interface should provide specific
 * text analysis functionality such as counting words,
 * finding unique words, or other text-based operations.
 * </p>
 */
public interface TextAnalyzer {
    int analyze(String text);
}

