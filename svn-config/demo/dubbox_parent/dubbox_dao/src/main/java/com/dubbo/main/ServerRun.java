package com.dubbo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServerRun {

	public static void main(String[] args) throws Exception {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath*:/spring/applicationContext.xml");
		System.out.println("dao服务已经启动。。。");
		System.in.read();
	}

}
