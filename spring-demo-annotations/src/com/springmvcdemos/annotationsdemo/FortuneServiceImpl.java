package com.springmvcdemos.annotationsdemo;

import org.springframework.stereotype.Component;

@Component("test")
public class FortuneServiceImpl implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Implementation of Fortune Service";
	}

}
