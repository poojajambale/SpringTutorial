package com.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean{
	private int id;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + "]";
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("From destroy");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("From init");
		
	}
	
	
}
