package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RestFortuneService implements FortuneService {

	//create an array of strings
	String [] data= {"Aditi Gaur","Ekta Kulkarni","Aparn Sihag"};
	
	private Random random=new Random();
	
	@Override
	public String getFortune() {
		// pick random string from the array
		int index=random.nextInt(data.length);
		
		String theFortune=data[index];
		return "Only in your dreams "+theFortune;
	}

}
