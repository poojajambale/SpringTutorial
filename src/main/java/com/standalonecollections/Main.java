package com.standalonecollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/standalonecollections/standalone.xml");
		Person p = (Person) context.getBean("person");
		
		System.out.println(p);
		System.out.println(p.getForm());
	}

}
