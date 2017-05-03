package com.springcloud.demo.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.springcloud.demo.filter.MyPreFilter;

@SpringBootApplication
@EnableZuulProxy
public class SpringcloudZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudZuulApplication.class, args);
	}

	@Bean
	public MyPreFilter getMyPreFilter() {
		return new MyPreFilter();
	}

}
