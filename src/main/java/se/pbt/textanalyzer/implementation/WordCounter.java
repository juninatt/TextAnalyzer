package se.pbt.textanalyzer.implementation;


import se.pbt.textanalyzer.annotations.TextAnalyzerLabel;
import se.pbt.textanalyzer.spi.TextAnalyzer;

@TextAnalyzerLabel(name = "Word Counter")
public class WordCounter implements TextAnalyzer {
    @Override
    public int analyze(String text) {
        return text.split("\\s+").length;
    }
}

