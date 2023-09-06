# GraalVM Native Image Setup and Usage Guide

## 🌍 Step 1: Environment Configuration

### Downloading and Installing Necessary Tools

1. **GraalVM**: Download and install GraalVM from the [official website](https://www.graalvm.org/downloads/).
2. **Visual Studio**: Ensure Visual Studio is installed with C++ support for the essential build tools.

### Setting Environment Variables

1. Set the `JAVA_HOME` environment variable to point to your GraalVM installation directory.
2. Incorporate GraalVM's `bin` directory into the system `PATH` environment variable.
3. (Windows only) Add the path to cl.exe (from the MSVC toolchain in Visual Studio) to the PATH environment variable.
This is typically located in a directory like C:\Program Files (x86)\Microsoft Visual Studio\<version>\VC\bin depending on the Visual Studio version and installation settings.

### Installing Native Image Tool

Utilize the GraalVM Updater tool to add the native-image component:
```bash
gu install native-image
```

## 🔧 Step 2: Translating Java into Native Images

### Compiling Classes

First, compile and package your project:
```bash
mvn clean package
 ```
Next, copy all dependencies:
```bash
mvn dependency:copy-dependencies -DoutputDirectory=libs
```

### Creating Native Executables

Convert the Java application JAR file into a standalone native executable:
```bash
native-image -cp "./target/TextAnalyzer-1.0.0.jar;./libs/*" -H:Name=dist/TextAnalyzer se.pbt.textanalyzer.TextAnalyzerApp
```
The semicolon (;) separator is used for Windows. For Linux or macOS, use a colon (:) instead.

## 📜 Step 3: Deciphering the Build Process

### **Dissecting the Build Output**

The build output details the processes involved in native image generation, covering aspects from memory allocation to resource utilization. 
Within this output, there are key recommendations to optimize the build. Implementing these, such as Profile-Guided Optimizations or heap size adjustments, can significantly improve memory efficiency and overall performance



 


