package com.example.demo.application3;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.application3.ApplicationConfig;
import com.example.demo.application3.BookService;

public class Application3 {

	public static void main(String[] args) {
		 ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		 String[] beanDefinition = context.getBeanDefinitionNames();
		 	System.out.println(Arrays.toString(beanDefinition));
		 BookService bookService = (BookService) context.getBean("bookService");
		 System.out.println(bookService.bookRepository != null);

	}
}
