package com.springcloud.demo.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
public class SpringcloudTurbineApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudTurbineApplication.class, args);
	}

}
