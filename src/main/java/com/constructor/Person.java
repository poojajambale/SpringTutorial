package com.constructor;

public class Person {
	private String name;
	private int id;
	private Child child;
	
	public Person(String name, int id, Child child) {
		this.name = name;
		this.id = id;
		this.child = child;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", child=" + child + "]";
	}

	
	
}
