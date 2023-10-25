package com.stereotypeannotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("Pooja")
	private String name;
	
	@Value("Pune")
	private String city;
	
	@Value("#{list}")
	private List<String> language;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public List<String> getLanguage() {
		return language;
	}

	public void setLanguage(List<String> language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + "]";
	}
	
}
