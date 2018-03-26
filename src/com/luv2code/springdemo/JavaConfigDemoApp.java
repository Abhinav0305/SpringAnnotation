package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		//read the spring config file
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportsConfig.class);

		//get the bean from spring container
		Coach theCoach=context.getBean("tennisCoach",Coach.class);
		
		Coach footieCoach=context.getBean("footballCoach",Coach.class);
		//call method on the bean
		System.out.println(theCoach.getDailyWorkout()+" "+footieCoach.getDailyWorkout());
		
		//call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		
		//close the context
		System.out.println("Calling close");
		context.close();
		System.out.println("Closed called");
		
	}

}
