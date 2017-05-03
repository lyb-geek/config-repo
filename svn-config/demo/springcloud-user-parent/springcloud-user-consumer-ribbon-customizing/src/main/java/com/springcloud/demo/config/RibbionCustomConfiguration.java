package com.springcloud.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
@ExcludeComponentScan
public class RibbionCustomConfiguration {

	@Bean
	public IRule ribbonRule() {

		return new RandomRule();
	}

}
