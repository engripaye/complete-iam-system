# Use OpenJDK as base image
FROM openjdk:21-jdk-slim

# Set the app JAR file
ARG JAR_FILE=target/iam-app.jar

# Copy the JAR into the container
COPY target/complete-iam-system-0.0.1-SNAPSHOT.jar app.jar

# Expose application port
EXPOSE 8080

# Run the app
ENTRYPOINT ["java", "-jar", "/app.jar"]
