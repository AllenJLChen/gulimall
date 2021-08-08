FROM gulimall:latest as build
WORKDIR /code/gulimall-gateway
COPY . /code/gulimall-gateway
RUN mvn package

FROM openjdk:8-jre
EXPOSE 80
WORKDIR /app
COPY --from=build /code/gulimall-gateway/target/*.jar .
CMD java -jar *.jar