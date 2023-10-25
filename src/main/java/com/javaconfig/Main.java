package com.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);		
		Student s = (Student) context.getBean("returnStudent");
		Student2 s2 = (Student2) context.getBean("student2");

		s.display();
		s2.display();
	}

}
