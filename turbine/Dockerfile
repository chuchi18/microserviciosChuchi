FROM openjdk:latest
WORKDIR /turbine
COPY ./target/turbine-0.0.1-SNAPSHOT.jar /turbine
EXPOSE 8011
CMD ["java", "-jar", "turbine-0.0.1-SNAPSHOT.jar"]