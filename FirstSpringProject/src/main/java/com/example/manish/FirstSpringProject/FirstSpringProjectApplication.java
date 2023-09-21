package com.example.manish.FirstSpringProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstSpringProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(FirstSpringProjectApplication.class, args);
		
		Car car1 = context.getBean(Car.class);
		System.out.println(car1.getEngine().getName());
		
//		Car car2 = context.getBean(Car.class);
//		System.out.println(car2);
		
		
	}

}
