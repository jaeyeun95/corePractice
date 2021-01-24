package com.ict.corePractice04_xmlConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Run {

	public static void main(String[] args) {
		
		ApplicationContext context =
				new GenericXmlApplicationContext("com/ict/corePractice04_xmlConfig/configuration/appConfig.xml");
		
		BookService bookService = context.getBean("bookService",BookService.class);	//"bookService"를 BookService.class타입으로 가져옴
		
		System.out.println(bookService.selectAllBooks());
		
		for(Book b : bookService.selectAllBooks()) {
			System.out.println(b);
		}
		
		System.out.println("====================");
		
		System.out.println(bookService.searchBookSequence(2));
	}

}
