package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		//read the spring config file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

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
