package com.springcloud.demo.consumer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.springcloud.demo.consumer.entity.User;

@RestController
@RequestMapping(value = "/userConsumer/")
public class UserConsumerController {

	@Value("${user.provider.addr}")
	private String userProviderAddr;

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

	@GetMapping(value = "getUserById/{id}", produces = "application/json; charset=utf-8")
	public User getUserById(@PathVariable Long id) {
		String url = userProviderAddr + "/userProvider/getUserById/{id}";
		System.out.println("url:" + url);
		return restTemplate.getForObject(url, User.class, id);
	}

}
