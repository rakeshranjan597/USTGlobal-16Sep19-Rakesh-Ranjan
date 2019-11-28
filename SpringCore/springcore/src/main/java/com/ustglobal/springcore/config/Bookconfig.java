package com.ustglobal.springcore.config;

import org.springframework.context.annotation.Bean;

import com.ustglobal.springcore.di.Author;
import com.ustglobal.springcore.di.Book;

public class Bookconfig {
	
	@Bean(name="author")
	public Author getAuthor() {
		Author author = new Author();
		author.setName("Chetan");
		author.setPenName("chinna");
		return author;
	}
	
	@Bean(name="book")
	public Book getBook() {
		Book book = new Book();
		book.setName("Python");
		book.setPrice(350);
		book.setAuthor(getAuthor());
		return book;
	}
}
