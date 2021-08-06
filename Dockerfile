#### Stage 1: Build the application
FROM openjdk:8-jdk-alpine as build

# Set the current working directory inside the image
WORKDIR /app

# Copy maven executable to the image
#COPY mvnw .
#COPY maven maven

# Copy the pom.xml file
#COPY pom.xml .
COPY . .


# Build all the dependencies in preparation to go offline.
# This is a separate step so the dependencies will be cached unless
# the pom.xml file has changed.
#RUN ./mvnw dependency:go-offline -B

# Package the application
RUN ./mvnw clean install -DskipTests
