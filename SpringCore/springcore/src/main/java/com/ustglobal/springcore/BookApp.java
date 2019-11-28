package com.ustglobal.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustglobal.springcore.config.Bookconfig;
import com.ustglobal.springcore.di.Book;

public class BookApp {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Bookconfig.class);
		Book book = context.getBean(Book.class);
		System.out.println("Book name: "+ book.getName());
		System.out.println("Book price: "+ book.getPrice());
		System.out.println("Author name: "+ book.getAuthor().getName());
		System.out.println("Author pen name: "+ book.getAuthor().getPenName());
	}
}
