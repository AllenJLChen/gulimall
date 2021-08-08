FROM openjdk:8-jdk-alpine as build

FROM maven
WORKDIR /code
COPY . /code/
RUN ./mvnw clean install
COPY . /code/

#FROM openjdk:8-jre
#EXPOSE 8080
#WORKDIR /app
#COPY --from=build /code/target/*.jar .
#CMD java -jar *.jar