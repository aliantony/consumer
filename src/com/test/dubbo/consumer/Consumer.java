package com.test.dubbo.consumer;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.dubbo.provider.TestRegistryService;

public class Consumer {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext.xml" });
		context.start();

		TestRegistryService demoService = (TestRegistryService) context.getBean("testRegistryService");
		String hello = demoService.hello("hejingyuan");
		System.out.println(hello);
		
		System.in.read();
	}

}