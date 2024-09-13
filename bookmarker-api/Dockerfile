# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file built by Maven to the container
COPY target/bookmarker-api-0.0.1-SNAPSHOT.jar /app/bookmarker-api.jar

# Expose the port that the application will run on
EXPOSE 8080

# Command to run the JAR file
ENTRYPOINT ["java", "-jar", "bookmarker-api.jar"]
