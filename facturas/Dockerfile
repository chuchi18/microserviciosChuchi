FROM openjdk:latest
WORKDIR /facturas
COPY ./target/facturas-0.0.1-SNAPSHOT.jar /facturas
EXPOSE 8087
CMD ["java", "-jar", "facturas-0.0.1-SNAPSHOT.jar"]