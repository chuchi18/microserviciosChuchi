FROM openjdk:latest
WORKDIR /config
COPY ./target/config-0.0.1-SNAPSHOT.jar /config
EXPOSE 8090
CMD ["java", "-jar", "config-0.0.1-SNAPSHOT.jar"]