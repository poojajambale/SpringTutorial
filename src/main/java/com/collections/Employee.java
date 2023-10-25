package com.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private String name;
	private List<String> number;
	private Set<String> address;
	private Map<String, String> course;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public List<String> getNumber() {
		return number;
	}
	public void setNumber(List<String> number) {
		this.number = number;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourse() {
		return course;
	}
	public void setCourse(Map<String, String> course) {
		this.course = course;
	}
	public Employee(String name, List<String> location, Set<String> address, Map<String, String> course) {
		super();
		this.name = name;
		this.number = number;
		this.address = address;
		this.course = course;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", number=" + number + ", address=" + address + ", course=" + course
				+ "]";
	}
	
}

