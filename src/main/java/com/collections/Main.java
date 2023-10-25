package com.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/collections/employee.xml");
		Employee emp1 = (Employee) context.getBean("employee1");
		
		System.out.println(emp1);
		System.out.println(emp1.getName());
		System.out.println(emp1.getNumber());
		System.out.println(emp1.getAddress());
		System.out.println(emp1.getCourse());
	}

}
