package com.standalonecollections;

import java.util.List;
import java.util.Map;

public class Person {
	private List<String> name;
	private Map<Integer, String> form;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<String> getName() {
		return name;
	}

	public void setName(List<String> name) {
		this.name = name;
	}
	
	public Map<Integer, String> getForm() {
		return form;
	}

	public void setForm(Map<Integer, String> form) {
		this.form = form;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", form=" + form + "]";
	}

}
