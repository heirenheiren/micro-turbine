package com.micro.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
//http://127.0.0.1:8085/turbine.stream
//http://127.0.0.1:8085/turbine.stream?cluster=ribbon

@EnableEurekaClient
@EnableTurbine
@SpringBootApplication
public class MicroTurbineApplication {
	public static void main(String[] args) {
		SpringApplication.run(MicroTurbineApplication.class, args);
	}
}
