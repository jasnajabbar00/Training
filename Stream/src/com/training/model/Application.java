package com.training.model;
import com.training.ifaces.crudRepository;
import com.training.model.Book;

import java.io.PrintStream;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import com.training.service.BookService;

public class Application {
	public static void print(List<Book> books) {
		for(Book eachBook:books) {
			System.out.println(eachBook);
		}
		}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book java = new Book(101,"java","suba",450);
		Book spring  = new Book(102,"spring","pavi",550);
		Book maven = new Book(103,"maven","sush",650);
		Book html = new Book(104,"html","anu",750);
		Book python = new Book(105,"python","sutha",1450);
		
		
		crudRepository service = new BookService();
		
		System.out.println("Id added:"+service.add(java));
	   // service.add(java);
		service.add(spring);
		service.add(maven);
		service.add(html);
		service.add(python);
		
		
		Book foundBook = service.findBy(101);
		System.out.println("found book" + foundBook);
		
		print(service.findAll());
		System.out.println(service.findAll().size());
		System.out.println();
	
	    System.out.println("--------------");
	    
	    System.out.println(service.remove(html));
	    System.out.println();
	    print(service.findAll());
	    Book react = new Book(105,"react js","sutha",7450);
	    service.add(react);
		print(service.findAll());
		
		Book reactNew = new Book(205,"python","subi",6450);
		service.update(react,reactNew);
		
		System.out.println("=====after update======");
	    service.add(reactNew);
		print(service.findAll());
		
		System.out.println("sorted by bookname");

		List<Book> list=service.findAll();
		Collections.sort(list);
		print(service.findAll());
		
		//Collections.sort(list,new Comparator());
		System.out.println("Sort by bookname");
		print(list);
		System.out.println("Greater than");
		BookService booklist = ((BookService)service);
		
		System.out.println("using streams");
		((BookService)service) 
		.findBooksGrtThan(600.00)
		.forEach(System.out::println);
		
		System.out.println("--------------");
		List<String> nameList = ((BookService)service).getBookNames();
		nameList.forEach(System.out::println);
		
		System.out.println("====");
		List<String> grtThanThousand=((BookService)service).getBookNames();
		grtThanThousand.forEach(System.out::println);
		
		System.out.println("sorted by name");
		List<Book> sortedByName=((BookService)service).sortedByName();
		sortedByName.forEach(System.out::println);
		
		System.out.println("reverse of Booknumber:");
		List<Book> sortedBynumber=((BookService)service).reverseByNumberdesc();
		sortedBynumber.forEach(System.out::println);
			
		
		}

}