FROM openjdk:8-alpine
COPY ./target/prueba-java-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
ENTRYPOINT ["java","-jar","prueba-java-0.0.1-SNAPSHOT.jar"]