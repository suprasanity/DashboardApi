# Use the official AdoptOpenJDK 18 image as the base image
FROM adoptopenjdk:18-jre-hotspot AS runtime

# Set the working directory inside the container
WORKDIR /app

# Copy the executable JAR file from the Jenkins build stage to the runtime stage
COPY target/*.jar app.jar

# Expose the port on which the application will run
EXPOSE 8080

# Set the entry point for the container
ENTRYPOINT ["java", "-jar", "app.jar"]
