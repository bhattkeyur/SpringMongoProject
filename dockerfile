FROM openjdk:17-jdk-alpine
COPY ./target/SpringMongoProject-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app/
ENTRYPOINT ["java","-jar","SpringMongoProject-0.0.1-SNAPSHOT.jar"]