package com.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/constructor/constructor.xml");
		Person p = (Person) context.getBean("person");		
		System.out.println(p);
		
		Addition addition = (Addition) context.getBean("add");
		System.out.println(addition);
		addition.Sum();
	}

}
