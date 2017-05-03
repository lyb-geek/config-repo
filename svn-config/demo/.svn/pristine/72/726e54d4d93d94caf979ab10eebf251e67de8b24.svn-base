package com.springcloud.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Contract;

@Configuration
public class UserCustomFeignConfiguration {
	@Bean
	public Contract feignContract() {
		return new feign.Contract.Default();
	}

}
