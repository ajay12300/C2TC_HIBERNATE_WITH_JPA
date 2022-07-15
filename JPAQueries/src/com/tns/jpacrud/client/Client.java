package com.tns.jpacrud.client;

import com.tns.jpacrud.entities.Book;
import com.tns.jpacrud.service.BookService;
import com.tns.jpacrud.service.BookServiceImpl;

public class Client {

	public static void main(String[] args) {

		BookService service = new BookServiceImpl();
		
		
		System.out.println("************Listing total number of books*************");
		System.out.println("Total books:"+service.getBookCount());
		
		System.out.println("************Listing book with id 105*************");
		System.out.println("Book with ID 106:"+service.getBookById(105));
		
		System.out.println("************Listing All books*************");
		for(Book books:service.getAllBooks()) {
			System.out.println(books);
		}
		
		
		
		System.out.println("************Listing book written by Danny Coward*************");
		for(Book books:service.getAuthorBooks("Danny Coward") ) {
			System.out.println(books);
		}
		
		System.out.println("************Listing book on Android*************");
		for(Book books:service.getBookByTitle("Android")) {
			System.out.println(books);
		}
		
		
		
		System.out.println("************Listing All books between 500 and 600*************");
		for(Book books:service.getBooksInPriceRange(500, 600) ) {
			System.out.println(books);
		}
		
		
		
		

	}
}