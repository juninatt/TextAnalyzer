package se.pbt.textanalyzer.implementation;




import se.pbt.textanalyzer.annotations.TextAnalyzerLabel;
import se.pbt.textanalyzer.spi.TextAnalyzer;

import java.util.HashSet;
import java.util.Set;

@TextAnalyzerLabel(name = "Unique Word Counter")
public class UniqueWordCounter implements TextAnalyzer {
    @Override
    public int analyze(String text) {
        Set<String> uniqueWords = new HashSet<>();
        for (String word : text.split("\\s+")) {
            uniqueWords.add(word);
        }
        return uniqueWords.size();
    }
}

