package com.stereotypeannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/stereotypeannotation/student.xml");
		Student s = (Student) context.getBean("student");
		
		System.out.println(s);
		System.out.println(s.getLanguage());
	}

}
