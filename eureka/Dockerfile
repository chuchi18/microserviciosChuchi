FROM openjdk:latest
WORKDIR /eureka
COPY ./target/eureka-0.0.1-SNAPSHOT.jar /eureka
EXPOSE 8761
CMD ["java", "-jar", "eureka-0.0.1-SNAPSHOT.jar"]