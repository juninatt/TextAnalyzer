package se.pbt.textanalyzer.provider;

import se.pbt.textanalyzer.annotations.TextAnalyzerLabel;
import se.pbt.textanalyzer.spi.TextAnalyzer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ServiceLoader;

public class TextAnalyzerProvider {
    public static void listAndChooseAnalyzers() {
        ServiceLoader<TextAnalyzer> loaders = ServiceLoader.load(TextAnalyzer.class);
        Map<String, TextAnalyzer> analyzerMap = new HashMap<>();

        System.out.println("Available Text Analyzers:");

        for (TextAnalyzer analyzer : loaders) {
            TextAnalyzerLabel annotation = analyzer.getClass().getAnnotation(TextAnalyzerLabel.class);
            if (annotation != null) {
                System.out.println("  " + annotation.name());
                analyzerMap.put(annotation.name(), analyzer);
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the name of the Text Analyzer you would like to use:");

        String choice = scanner.nextLine();
        TextAnalyzer selectedAnalyzer = analyzerMap.get(choice);

        if (selectedAnalyzer == null) {
            System.out.println("Invalid choice. Exiting.");
            return;
        }

        System.out.println("Please enter the text you would like to analyze:");
        String text = scanner.nextLine();

        int result = selectedAnalyzer.analyze(text);
        System.out.println("The result of the analysis is: " + result);
    }
}
