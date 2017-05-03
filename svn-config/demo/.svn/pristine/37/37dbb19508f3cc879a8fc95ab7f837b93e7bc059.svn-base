package com.springcloud.demo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.client.RestTemplate;

import com.springcloud.demo.config.ExcludeComponentScan;
import com.springcloud.demo.config.RibbionCustomConfiguration;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(excludeFilters = @Filter(type = FilterType.ANNOTATION, classes = ExcludeComponentScan.class))
@RibbonClient(name = "springcloud-user-provider", configuration = { RibbionCustomConfiguration.class })
public class SpringcloudUserConsumerApplication {

	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudUserConsumerApplication.class, args);
	}
}
