package com.code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//load the configuration file
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrive the bean from springContainer here mycoach is <id> defined in xml
		Coach theCoach = applicationContext.getBean("myCoach", Coach.class);
		
		//call the methods
		System.out.println("coach : "+theCoach.getWorkOut());
		
		System.out.println("my fortune Service : "+theCoach.getDailyFortuneService());
		//close context
		applicationContext.close();
		
	}

}
