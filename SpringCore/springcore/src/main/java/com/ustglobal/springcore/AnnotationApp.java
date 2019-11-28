package com.ustglobal.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.ustglobal.springcore.config.HelloConfigrationClass;
import com.ustglobal.springcore.di.Animal;
import com.ustglobal.springcore.di.Hello;
import com.ustglobal.springcore.di.Pet;

public class AnnotationApp {
	public static void main(String[] args) {
//		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigrationClass.class);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloConfigrationClass.class);
		
		Hello hello = context.getBean(Hello.class);
		System.out.println(hello.getMsg());
		
		System.out.println("~~~~~~~~~~~~~~~~");
//		Animal animal = context.getBean(Animal.class);
//		animal.makeSound();
		
		System.out.println("~~~~~~~~~~~~~~~~~");
		Pet pet = context.getBean(Pet.class);
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
		
		context.close();
	}
}
