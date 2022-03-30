package com.springmvcdemos.annotationsdemo;

import org.springframework.stereotype.Component;

@Component("testing")
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "You will have a happy day today!!";
	}

}
