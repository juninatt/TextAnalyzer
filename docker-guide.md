## 🐳 Dockerizing Your GraalVM Native Image: A Quick Guide

### 📥 Docker Installation

Before diving in, ensure **Docker** is up and running on your system.

- **Windows/Mac**: Install [Docker Desktop](https://www.docker.com/products/docker-desktop).
- **Linux**: Follow the instructions for your specific distribution from Docker's official [installation guide](https://docs.docker.com/engine/install/).


### 🏭 Building the Docker Image

Command to build docker image from the [Dockerfile](Dockerfile):
```bash
docker build -t textanalyzer-native-image .
```

### 🚀 Running Your Application in a Docker Container

Once the Docker image is built, you can launch a container from it to execute your Java application:

```bash
docker run --name textanalyzer-container textanalyzer-native-image
```


