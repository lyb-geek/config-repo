package com.springcloud.demo.consumer.feign;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.springcloud.demo.consumer.entity.User;

import feign.hystrix.FallbackFactory;

@Component
public class UserFeignClientFallbackFactory implements FallbackFactory<UserFeignClient> {

	private Logger logger = LoggerFactory.getLogger(UserFeignClientFallbackFactory.class);

	@Override
	public UserFeignClient create(Throwable cause) {

		logger.info("fallback; reason was:{}", cause.getMessage());
		return new UserFeginClientWithFallbackFactroy() {

			@Override
			public User getUserById(Long id) {
				// TODO Auto-generated method stub
				User user = new User();
				user.setAge(0);
				user.setId(0L);
				user.setUsername("userFeignClientFallbackFactory");
				return user;
			}
		};
	}

}
