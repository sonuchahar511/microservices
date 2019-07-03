package com.chahar.springboot.microservice.example.hellowithjsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableDiscoveryClient
public class SpringBootMicroserviceHelloWithJspServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroserviceHelloWithJspServiceApplication.class, args);
	}
}
