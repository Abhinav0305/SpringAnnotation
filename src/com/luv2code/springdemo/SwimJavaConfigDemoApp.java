package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		//read the spring config file
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportsConfig.class);

		//get the bean from spring container
		SwimCoach theCoach=context.getBean("swimCoach",SwimCoach.class);
		
		//call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		
		System.out.println("email and name "+theCoach.getEmail()+" "+theCoach.getTeam());
		//close the context
		System.out.println("Calling close");
		context.close();
		System.out.println("Closed called");
		
	}

}
