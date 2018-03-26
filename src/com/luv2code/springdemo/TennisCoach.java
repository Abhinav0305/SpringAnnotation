package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("customFortuneService")
	private FortuneService fortuneService;
	
	
	public TennisCoach() {
		System.out.println("Inside Tennis coach default constructor");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	//define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("Tenniscoach : inside init");
	}
	
	//define my destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		fortuneService.getFortune();
	}
}
