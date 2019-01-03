package com.code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach theCoach = applicationContext.getBean("myCoach",Coach.class);
		
		Coach alphaCoach = applicationContext.getBean("myCoach",Coach.class);
		
		boolean result = (theCoach==alphaCoach);
		System.out.println("This is example for scope of bean : singleton and prototype ");
		System.out.println("To see changes change the xml accordingly");
		
		System.out.println("\nPrinting the same object : "+result);
		
		System.out.println("\nMemory location of theCoach : "+theCoach);
		
		System.out.println("\nMemory location of alphaCoach :  "+alphaCoach);
		
		
	}

}
