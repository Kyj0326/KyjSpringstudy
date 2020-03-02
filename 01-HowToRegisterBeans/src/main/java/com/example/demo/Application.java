package com.example.demo;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
	 ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
	 String[] beanDefinition = context.getBeanDefinitionNames();
	 	System.out.println(Arrays.toString(beanDefinition));
	 BookService bookService = (BookService) context.getBean("bookService");
	 System.out.println(bookService.bookRepository != null);
	 bookService.test();
	 
	}

}
