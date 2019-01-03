package com.code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDempApp {
	public static void main(String[] args) {
		
		
		//load the config file
		
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		// Retrieve bean using the spring container
		CricketCoach thecoach = applicationContext.getBean("myCricketCoach",CricketCoach.class);
		// call the method
		System.out.println("getWorkOut : "+thecoach.getWorkOut());
		
		System.out.println("getDailyFortuneService : "+thecoach.getDailyFortuneService());
		System.out.println("getteam : "+thecoach.getEmail());
		System.out.println("getemail : "+thecoach.getTeam());
		
		//close applicationContext
		applicationContext.close();
	}
}

