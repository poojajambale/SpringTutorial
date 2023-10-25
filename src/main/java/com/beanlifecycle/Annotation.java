package com.beanlifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Annotation {
	private String name;

	public Annotation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Annotation [name=" + name + "]";
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Initializing");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destroying");
	}
	
}
