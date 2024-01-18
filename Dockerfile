# Use an official Ubuntu runtime as a build image
FROM ubuntu:latest AS build

# Update packages and install OpenJDK 17
RUN apt-get update && \
    apt-get install -y openjdk-17-jdk

# Set the working directory in the container
WORKDIR /app

# Copy the project files to the container
COPY . .

# Build the Spring Boot application
RUN ./mvnw clean package -DskipTests

# Use an official OpenJDK runtime as a base image
FROM openjdk:17-jdk-slim

# Expose port 8080
EXPOSE 8080

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file from the build stage to the production stage
COPY --from=build /app/target/demo1-0.0.1-SNAPSHOT.jar app.jar

# Define the command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
