package com.springcloud.demo.consumer.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springcloud.demo.config.CustomFeignConfiguration;

@FeignClient(name = "eureka-test", url = "http://localhost:8761", configuration = CustomFeignConfiguration.class)
public interface EurekaFeginClient {

	@RequestMapping(value = "/eureka/apps/{serviceName}", method = RequestMethod.GET)
	public String getServiceInfo(@PathVariable("serviceName") String serviceName);

}
