package com.example.manish.FirstSpringWebProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class FirstController {
	
	@GetMapping()
	public String getHomePage() {
		return "This is starter project of Spring Web";
	}
	
	@GetMapping("search")
	public String getHelloWorld() {
		return "Hello World";
	}
	
	@GetMapping("searching")
	public String Request(@RequestParam(name = "q") String value) {
		return "Hello, how are you "  + value;
	}
	
	
	@GetMapping("searchinpath/{celebrity_name}")
	public String searchPathVariable(@PathVariable (name = "celebrity_name") String value)
	{
		
		return "Hey buddy " + value; 
	}
	
	//localhost:8080/post
	@PostMapping(path = "post")
	public void Post() {
		System.out.println("Running post fine");
		
	}
	
	
	

}
