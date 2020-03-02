package com.example.demo;

public class BookService {

	BookRepository bookRepository;

	public void setBookRepository(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	public void test() {
		System.out.println("찍히냐");
	}

	
	
}
