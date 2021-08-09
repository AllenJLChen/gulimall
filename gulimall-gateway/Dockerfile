#FROM registry.cloud.okteto.net/gulimall-allenjlchen/gulimall:latest as build
#FROM okteto.dev/gulimall:okteto as build
FROM registry.cloud.okteto.net/gulimall-allenjlchen/gulimall:okteto as build
WORKDIR /code
#COPY . /code/gulimall-gateway
#RUN ./mvnw clean install -DskipTests
#RUN ./mvnw dependency:go-offline -B

#FROM maven
EXPOSE 8081
#WORKDIR /app
#COPY --from=build /code/gulimall-gateway/target/*.jar .
#COPY --from=build /code/gulimall-gateway/ .
#CMD java -jar *.jar
#CMD mvn spring-boot:run
CMD cd gulimall-gateway/target && ls && java -jar *.jar