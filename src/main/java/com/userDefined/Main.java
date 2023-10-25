package com.userDefined;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/userDefined/a.xml");
		A a = (A) context.getBean("aref");
		System.out.println(context.getBean("bref"));
		
		System.out.println(a.getX());
		System.out.println(a.getB().getY());
	}

}
