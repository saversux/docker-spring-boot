FROM openjdk:8-alpine
COPY ./target/docker-spring-boot-2.0-SNAPSHOT.jar app.jar
CMD ["java", "-Dvaadin.productionMode=true", "-jar", "/app.jar"]
EXPOSE 8080