package com.springmvcdemos.annotationsdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
//@ComponentScan("com.springmvcdemos.annotationsdemo")
public class SportConfig {
	
	@Bean
	public FortuneService sadFortuneService() {
		return new SadForutneService();
	}
	
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}

}
