# Text Analyzer SPI Project

Text Analyzer is a Java-based project leveraging the Service Provider Interface (SPI) mechanism to provide various text analysis functionalities.

## Overview

This project offers a pluggable architecture allowing various text analysis functionalities. The main functionalities provided include:

1. Counting the number of unique words in a given text.
2. Counting the total number of words in a given text.

Developers can seamlessly add more functionalities by implementing the `TextAnalyzer` interface.

## Features

### TextAnalyzerLabel Annotation

An annotation that assigns a human-readable name to different `TextAnalyzer` implementations. This enables easy identification of the functionality provided by each implementation.

### TextAnalyzer Interface

A central interface that all text analysis functionalities must implement. It requires the implementation of a single method `analyze` that takes in textual data as input.

### TextAnalyzerProvider

A utility class that lists all available `TextAnalyzer` implementations and allows users to select and use one at runtime. The ServiceLoader mechanism discovers available implementations.

## How to Use

1. Compile and run the Main class.
2. The system will display a list of available Text Analyzers.
3. Enter the name of the Text Analyzer you wish to use.
4. Provide the text you'd like to analyze.
5. View the analysis result displayed on the console.

## Implementations

### UniqueWordCounter

An implementation that counts the number of unique words in a provided text.

### WordCounter

An implementation that counts the total number of words in a provided text.

## Extending the Project

To add more text analysis functionalities:

1. Implement the `TextAnalyzer` interface in your new class.
2. Annotate the class with `@TextAnalyzerLabel` providing a descriptive name.
3. The ServiceLoader mechanism will automatically recognize and list your implementation.

## Building as a Native Image with GraalVM

If you're looking to build this project as a native-image using GraalVM for enhanced performance and reduced startup times, follow the guide available [here](graalvm-setup-guide.md).

## Maven Configuration

- **Group ID**: se.pbt
- **Artifact ID**: TextAnalyzer
- **Version**: 1.0.0 
- **Java Version**: 20
- **JUnit Version**: 5.8.0

## Running the Project

Execute the `Main` class to start the project. This will invoke the `TextAnalyzerProvider` which lists and manages the available `TextAnalyzer` implementations.

## Contributions

Feel free to submit pull requests or raise issues if you wish to enhance the project or fix any bugs.

## Author

Petter Bergström / [juninatt](https://github.com/juninatt) on GitHub.

