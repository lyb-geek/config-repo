package com.springcloud.demo.consumer.controller;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.springcloud.demo.consumer.entity.User;

@RestController
@RequestMapping(value = "/userConsumer/")
public class UserConsumerController {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private DiscoveryClient discoveryClient;

	@Autowired
	private EurekaClient eurekaClient;

	@GetMapping(value = "serviceUrl")
	public String serviceUrl() {
		InstanceInfo instance = eurekaClient.getNextServerFromEureka("springcloud-user-provider", false);
		return instance.getHomePageUrl();
	}

	@GetMapping(value = "instanceUrl")
	public List<ServiceInstance> getInstanceUrl() {
		List<ServiceInstance> list = discoveryClient.getInstances("springcloud-user-provider");
		return list;
	}

	@HystrixCommand(fallbackMethod = "getUserByIdFallback")
	@GetMapping(value = "getUserById/{id}", produces = "application/json; charset=utf-8")
	public User getUserById(@PathVariable Long id) {
		String url = "http://springcloud-user-provider" + "/userProvider/getUserById/{id}";
		System.out.println("url:" + url);
		return restTemplate.getForObject(url, User.class, id);
	}

	@GetMapping(value = "list")
	public List<User> list() {
		String url = "http://springcloud-user-provider" + "/userProvider/list";
		User[] users = restTemplate.getForObject(url, User[].class);

		return Arrays.asList(users);
	}

	public User getUserByIdFallback(Long id) {
		User user = new User();
		user.setAge(999);
		user.setBalance(new BigDecimal(99999));
		user.setId(999L);
		user.setUsername("BUG用户");

		return user;
	}

}
