package com.springcloud.demo.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

@SpringBootApplication
@EnableSidecar
public class SpringcloudSidecarApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudSidecarApplication.class, args);
	}

}
