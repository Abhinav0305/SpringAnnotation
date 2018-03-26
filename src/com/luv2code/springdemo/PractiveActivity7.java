package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PractiveActivity7 {

	public static void main(String[] args) {
		//read the spring config file
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringDemoAnnotation.class);

		//get the bean from spring container
		Coach theCoach=context.getBean("badmintonCoach",Coach.class);
		
		//call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
	}

}
