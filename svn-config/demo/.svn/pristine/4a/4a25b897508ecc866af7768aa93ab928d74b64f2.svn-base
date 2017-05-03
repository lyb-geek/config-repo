package com.springcloud.demo.consumer.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;

import com.springcloud.demo.config.UserCustomFeignConfiguration;
import com.springcloud.demo.consumer.entity.User;

import feign.Param;
import feign.RequestLine;

@FeignClient(name = "springcloud-user-provider", configuration = UserCustomFeignConfiguration.class)
public interface UserFeignClient {

	@RequestLine("GET /userProvider/getUserById/{id}")
	public User getUserById(@Param("id") Long id);// feign不支持getMaping注解，@PathVariable（"id"）必须指定不能直接@PathVariable

	@RequestLine("POST /userProvider/postUser")
	public User postUser(@RequestBody User user);

}
