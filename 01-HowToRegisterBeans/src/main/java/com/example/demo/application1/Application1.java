package com.example.demo.application1;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.application1.BookService;

public class Application1 {

	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("application1.xml");
		 String[] beanDefinition = context.getBeanDefinitionNames();
		 	System.out.println(Arrays.toString(beanDefinition));
		 BookService bookService = (BookService) context.getBean("bookService");
		 System.out.println(bookService.bookRepository != null);

	}

}
