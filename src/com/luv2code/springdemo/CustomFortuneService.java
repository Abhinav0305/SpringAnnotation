package com.luv2code.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class CustomFortuneService implements FortuneService {

	private List<String> fortunes=new ArrayList<String>();
	public void loadFortunes() throws IOException{
		BufferedReader br=new BufferedReader(new FileReader(new File("C:\\Users\\abhinavsingh\\eclipse-workspace\\spring-demo-annotations\\fortunes.txt")));
		
		String line=null;
		while((line=br.readLine())!=null) {
			fortunes.add(line);
		}
		
		br.close();
	}
	
	public CustomFortuneService() {
		System.out.println("Inside custom fortune service ");
	}
	private Random random=new Random();
	
	public String getFortune() {
		try{
			loadFortunes();
		}catch(IOException e) {
			System.out.println("Exception");
		}
		int index=random.nextInt(fortunes.size());
		
		String fortune=fortunes.get(index);
		return fortune;
		
	}
}
