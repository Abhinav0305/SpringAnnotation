package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	public HappyFortuneService() {
		
	}
	@Override
	public String getFortune() {
		return "Have a nice friday";
	}

}
