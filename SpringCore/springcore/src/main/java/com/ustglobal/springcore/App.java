package com.ustglobal.springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.springcore.di.Animal;
import com.ustglobal.springcore.di.Hello;
import com.ustglobal.springcore.di.Pet;

public class App {
    public static void main( String[] args ) {
   
    //will look for configuration.xml bean file if it is not in path then throw execption.
    
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//    	BeanFactory context = new ClassPathXmlApplicationContext("beans.xml");
  
    // if configuration.xml contains any bean named "a" and holds reference to class(hello) 
    // load it immediately and return object of that class   	
    	
    	Hello hello = context.getBean(Hello.class);
    	System.out.println(hello.getMsg());
    	
    	System.out.println(hello.getMap());
    	
    	Hello hello2 = context.getBean(Hello.class); 
    	System.out.println(hello);
    	System.out.println(hello2);
    	
    	Animal animal = context.getBean(Animal.class);
    	animal.makeSound();
    	
    	Animal animal2 = (Animal) context.getBean("dog");
    	animal2.makeSound();
    	System.out.println("~~~~~~~~~~~~~~~~~~");
    	
    	Pet pet = context.getBean(Pet.class);
    	System.out.println(pet.getName());
    	pet.getAnimal().makeSound();
    	
    }
}
