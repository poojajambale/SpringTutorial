package com.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student2 {
	@Autowired 
	private Child child;
	
	public Child getChild() {
		return child;
	}

	public void setChild(Child child) {
		this.child = child;
	}

	public Student2(Child child) {
		super();
		this.child = child;
	}

	public void display() {
		System.out.println("------");
		this.child.childDisplay();
		System.out.println("Displaying from student 2");
	}
}
