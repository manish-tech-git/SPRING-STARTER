package com.example.manish.FirstSpringProject;

import org.springframework.stereotype.Component;

@Component 
public class Engine {
	
	private String name = "V8";
	private int cc = 2000;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	
	
	
	
	

}
