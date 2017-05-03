package com.springcloud.demo.consumer.feign;

import org.springframework.stereotype.Component;

import com.springcloud.demo.consumer.entity.User;

@Component
public class UserFeignClientFallback implements UserFeignClient {

	@Override
	public User getUserById(Long id) {
		User user = new User();
		user.setAge(-1);
		user.setId(-1L);
		user.setUsername("userFeignClientFallback");
		return user;
	}

}
