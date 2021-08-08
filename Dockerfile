FROM maven as build
WORKDIR /code
COPY . /code/
RUN ./mvnw clean install

#FROM openjdk:8-jre
#EXPOSE 8080
#WORKDIR /app
#COPY --from=build /code/target/*.jar .
#CMD java -jar *.jar