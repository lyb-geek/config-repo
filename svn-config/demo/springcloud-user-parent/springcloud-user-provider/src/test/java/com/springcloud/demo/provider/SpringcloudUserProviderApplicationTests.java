package com.springcloud.demo.provider;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.springcloud.demo.provider.dao.UserDao;
import com.springcloud.demo.provider.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringcloudUserProviderApplicationTests {
	@Autowired
	private UserDao userDao;

	@Test
	public void testAdd() {
		User user = new User();
		user.setAge(24);
		user.setBalance(new BigDecimal("24"));
		user.setUsername("李四");
		userDao.save(user);
	}

}
