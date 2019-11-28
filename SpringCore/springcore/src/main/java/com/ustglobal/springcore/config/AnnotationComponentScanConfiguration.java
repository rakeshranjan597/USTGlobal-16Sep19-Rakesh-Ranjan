package com.ustglobal.springcore.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustglobal.springcore.di.Hello;
import com.ustglobal.springcore.di.Pet;

public class AnnotationComponentScanConfiguration {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfiguration.class);
		
		Hello hello = context.getBean(Hello.class);
		hello.setMsg("I love python");
		System.out.println(hello.getMsg());
		
		Pet pet = context.getBean(Pet.class);
		pet.setName("Google ");
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
	}
}
