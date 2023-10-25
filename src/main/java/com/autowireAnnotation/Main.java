package com.autowireAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context =  new ClassPathXmlApplicationContext("com/autowireAnnotation/annotation.xml");
		Emp emp = (Emp) context.getBean("emp");
		
		System.out.println(emp);
	}

}
