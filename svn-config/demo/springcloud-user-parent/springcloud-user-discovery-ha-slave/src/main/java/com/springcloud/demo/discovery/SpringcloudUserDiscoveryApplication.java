package com.springcloud.demo.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudUserDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudUserDiscoveryApplication.class, args);
	}

}
