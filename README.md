# 🖋️ Text Analyzer SPI Project

Text Analyzer is a Java project using the Service Provider Interface (SPI) for text analysis. It includes support for GraalVM native image creation and Docker containerization

## Overview

This project offers a pluggable architecture allowing various text analysis functionalities. The main functionalities provided include:

### 🔢 UniqueWordCounter

An implementation that counts the number of unique words in a provided text.

### 🔢 WordCounter

An implementation that counts the total number of words in a provided text.


## Try out

1. Compile and run the Main class.
2. The system will display a list of available Text Analyzers.
3. Enter the name of the Text Analyzer you wish to use.
4. Provide the text you'd like to analyze.
5. View the analysis result displayed on the console.


## Building as a Native Image with GraalVM

If you're looking to build this project as a native-image using GraalVM, follow the guide available [here](graalvm-setup-guide.md).


## 🛠️ Maven Configuration

- **Group ID**: se.pbt
- **Artifact ID**: TextAnalyzer
- **Version**: 1.0.0
- **Java Version**: 20
- **JUnit Version**: 5.8.0


## ✍️ Author

Petter Bergström / [juninatt](https://github.com/juninatt) on GitHub.
