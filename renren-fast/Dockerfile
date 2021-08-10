#FROM java:8
#EXPOSE 8080
#
#VOLUME /tmp
#ADD renren-fast.jar  /app.jar
#RUN bash -c 'touch /app.jar'
#ENTRYPOINT ["java","-jar","/app.jar"]

FROM registry.cloud.okteto.net/gulimall-allenjlchen/gulimall:okteto as build
WORKDIR /code
#COPY . /code/gulimall-gateway
#RUN ./mvnw clean install -DskipTests
#RUN ./mvnw dependency:go-offline -B
#FROM maven
EXPOSE 8080
#WORKDIR /app
#COPY . /app
#COPY --from=build /code/gulimall-gateway/target/*.jar .
#COPY --from=build /code .
#CMD java -jar *.jar
CMD cd renren-fast && ./mvnw clean install spring-boot:run
#CMD cd renren-fast/target && ls && java -jar *.jar
#RUN cd renren-fast && ./mvnw spring-boot:run