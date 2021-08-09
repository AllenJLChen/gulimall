FROM openjdk:8-jdk-alpine as build

#FROM maven
WORKDIR /code
COPY . /code/
#RUN ./mvnw dependency:go-offline -B
RUN ./mvnw clean install -DskipTests
#RUN mvn install -DskipTests