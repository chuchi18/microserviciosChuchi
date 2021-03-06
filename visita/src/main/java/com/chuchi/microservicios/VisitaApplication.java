package com.chuchi.microservicios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class VisitaApplication {

	public static void main(String[] args) {
		SpringApplication.run(VisitaApplication.class, args);
	}

}
