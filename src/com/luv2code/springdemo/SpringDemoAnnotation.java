package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDemoAnnotation {

	@Bean
	public FortuneService todaysFortune() {
		return new TodaysFortune();
	}
	
	@Bean
	public Coach badmintonCoach() {
		return new BadmintonCoach(todaysFortune());
	}
}
