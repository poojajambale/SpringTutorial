package com.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.javaconfig")
public class JavaConfig {
	
	@Bean
	public Child returnChild() {
		Child child = new Child();
		return child;
	}
	
	@Bean
	public Student returnStudent() {
		Student student = new Student(returnChild());	
		return student;
	}
	
}
