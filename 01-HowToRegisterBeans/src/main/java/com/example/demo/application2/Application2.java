package com.example.demo.application2;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application2 {

	public static void main(String[] args) {
		 ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		 String[] beanDefinition = context.getBeanDefinitionNames();
		 	System.out.println(Arrays.toString(beanDefinition));
		 BookService bookService = (BookService) context.getBean("bookService");
		 System.out.println(bookService.bookRepository != null);

	}

}
