package com.luv2code.springdemo;

public class BadmintonCoach implements Coach {

	private FortuneService fortuneService;
	
	public BadmintonCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Play badminton with your brains";
	}

	@Override
	public String getDailyFortune() {
		return "Yo positive weather today ";
	}

}
