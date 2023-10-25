package com.beanlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context =  new ClassPathXmlApplicationContext("com/beanlifecycle/lifecycle.xml");
		Student s = (Student) context.getBean("student");
		context.registerShutdownHook();
		
		System.out.println(s);
		
		Employee emp = (Employee) context.getBean("employee");
		System.out.println(emp);
		
		Annotation a = (Annotation) context.getBean("annotation");
		System.out.println(a);
	}

}
