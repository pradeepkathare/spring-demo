package com.code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;


//NOte : In prototype the destroy method is 
public class BeanLifeCycleDempApp {
	public static void main(String[] args) {
		
		
		//load the config file		
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		// Retrieve bean using the spring container
		Coach thecoach = applicationContext.getBean("myCoach",Coach.class);
		// call the method
		System.out.println("getWorkOut : "+thecoach.getWorkOut());
		
	
		
		//close applicationContext
		applicationContext.close();
	}
}

