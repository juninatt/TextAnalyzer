package se.pbt.textanalyzer;

import se.pbt.textanalyzer.provider.TextAnalyzerProvider;

public class TextAnalyzerApp {
    public static void main(String[] args) {
        TextAnalyzerProvider.listAndChooseAnalyzers();
    }
}