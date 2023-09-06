# Use a lightweight base image
FROM debian:bullseye-slim

# Copy the native executable
COPY dist/TextAnalyzer.exe /app/TextAnalyzer.exe

# Set the working directory
WORKDIR /app

# Set the executable permissions
RUN chmod +x /app/TextAnalyzer.exe

# Command to run the application
CMD ["./TextAnalyzer.exe"]
