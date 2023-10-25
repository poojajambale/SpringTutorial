package com.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spel/spel.xml");
		Demo d = (Demo) context.getBean("demo");
		
		System.out.println(d);
	}

}
