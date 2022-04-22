package com.training.model;

import java.security.Provider.Service;
import java.util.Collections;
import java.util.List;

import com.training.model.Book;
import com.training.model.CrudRepository;
import com.training.service.BookService;

public class Application {
	public static void print(List<Book> books)
	{

		for(Book eachBook: books)
		{
			System.out.println(eachBook);
		}
		//books.forEach(System.out::println)-instead of for loop
	}

	public static void main(String[] args) {

		Book java=new Book(101,"java","suba",450);
		Book spring=new Book(102,"Spring","Mad",650);
		Book maven =new Book(103,"Maven","Harish",550);
		Book html=new Book(104,"Html","Priya",1450);
		Book python=new Book(105,"Python","sathiya",850);
		
		CrudRepository service=new BookService();
		
		System.out.println("Greater than 400");
		List<Book>bookList=(List<Book>)service).getBookGrtThan(800);//casting
		bookList.forEach(System.out::println);
		
		System.out.println("==============");
		Book foundBook=service.findBy(101);
				
				System.out.println("Foung Book"+foundBook);
		System.out.println(service.add(java));
		System.out.println(service.add(spring));
	  	System.out.println(service.add(maven));
		System.out.println(service.add(html));
		System.out.println(service.add(python));
		
		print(service.findAll());
		
			System.out.println();

	System.out.println(service.remove(html));
	System.out.println(service.findAll().size());
	System.out.println();
	
print(service.findAll());
	
	Book react=new Book(205,"ReactJS","Rahul",6850);
	
	service.add(react);
   
	
	Book reactNew=new Book(205,"ReactJS","Rahul",7850);
	System.out.println("####################3");
	Book react2=new Book(203,"react 2.0","keerthik",650);
			
	service.update(react,react2);
	Book javaNew=new Book(201,"java","keerth",450);
	service.update(java,javaNew);
	print(service.findAll());
	
	System.out.println("sorted by author");
	List<Book> list=service.findAll();
	Collections.sort(list);
	print(service.findAll());
	}
	
	
}
