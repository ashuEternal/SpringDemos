package com.springmvcdemos.annotationsdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("testTennisCoach")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("testing")
	private FortuneService fortuneService;
	
	

	public TennisCoach() {
	}



	@Autowired
	public TennisCoach(@Qualifier("testing")FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("Constructor was called");
	}

	@Autowired
	@Qualifier("test")
	public void testMethod(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("Setter was called");
	}



	@Override
	public String getDailyWorkout() {
		
		return "Practice your serve daily";
	}
	
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
