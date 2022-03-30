package com.springmvcdemos.annotationsdemo;

public class SadForutneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "It might be sad now.. but it will ossum later";
	}

}
