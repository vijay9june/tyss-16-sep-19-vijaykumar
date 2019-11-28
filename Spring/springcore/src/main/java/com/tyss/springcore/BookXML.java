package com.tyss.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.springcore.di.Author;
import com.tyss.springcore.di.Book;

public class BookXML {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("book.xml");
		Author author = context.getBean(Author.class);
		System.out.println(author.getName());
		
		Book book = context.getBean(Book.class);
		System.out.println(book.getName());
		System.out.println(book.getAuthor());
	
	
	}

}
