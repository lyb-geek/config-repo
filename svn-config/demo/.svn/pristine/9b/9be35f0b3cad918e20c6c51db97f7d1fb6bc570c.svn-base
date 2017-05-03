package com.springcloud.demo.provider.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Lists;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.springcloud.demo.provider.dao.UserDao;
import com.springcloud.demo.provider.entity.User;

@RestController
@RequestMapping(value = "/userProvider/")
public class UserPrividerController {

	@Autowired
	private UserDao userDao;

	@Autowired
	private DiscoveryClient discoveryClient;

	@Autowired
	private EurekaClient eurekaClient;

	@GetMapping(value = "getUserById/{id}", produces = "application/json; charset=utf-8")
	public User getUserById(@PathVariable Long id) {

		return userDao.findOne(id);
	}

	@GetMapping(value = "serviceUrl")
	public String serviceUrl() {
		InstanceInfo instance = eurekaClient.getNextServerFromEureka("springcloud-user-consumer", false);
		return instance.getHomePageUrl();
	}

	@GetMapping(value = "instanceUrl")
	public List<ServiceInstance> getInstanceUrl() {
		List<ServiceInstance> list = discoveryClient.getInstances("springcloud-user-consumer");
		return list;
	}

	@PostMapping(value = "postUser")
	public User getUserWithPost(@RequestBody User user) {
		System.out.println(user);
		return user;

	}

	@GetMapping(value = "list")
	public List<User> list() {
		List<User> list = Lists.newArrayList();
		for (int i = 0; i < 5; i++) {
			User user = new User();
			user.setAge(i + 20);
			user.setId(Long.valueOf(i + ""));
			user.setUsername("xx" + i);
			list.add(user);
		}

		return list;

	}

}
