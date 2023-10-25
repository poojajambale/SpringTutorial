package com.javaconfig;

import org.springframework.stereotype.Component;

public class Student {
	private Child child;
		
	public Student(Child child) {
		super();
		this.child = child;
	}

	public Child getChild() {
		return child;
	}

	public void setChild(Child child) {
		this.child = child;
	}

	public void display() {
		this.child.childDisplay();
		System.out.println("Displaying");
	}
}
