package com.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.training.model.Book;
import com.training.model.CrudRepository;
import com.training.service.BookService;
import com.training.utils.BookNameComparator;

public class App {

	public static void main(String[] args) {
	
		List<String> names = new ArrayList<>();
		names.add("Ramesh");
		names.add("Anjana");
		names.add("Chandru");
		names.add("Zoya");
		names.add("Prathysh");
		System.out.println(names);
		Collections.sort(names);
		System.out.println(names);
		
		Book java=new Book(101,"java","suba",450);
		Book spring=new Book(102,"Spring","Mad",650);
		Book maven =new Book(103,"Maven","Harish",550);
		Book html=new Book(104,"Html","Priya",1450);
		Book python=new Book(105,"Python","sathiya",850);
		
		CrudRepository service=new BookService();
		
		System.out.println(service.add(java));
		System.out.println(service.add(spring));
	  	System.out.println(service.add(maven));
		System.out.println(service.add(html));
		System.out.println(service.add(python));
		
	  List<Book> booklist=service.findAll();
	  Collections.sort(booklist);
	  
	  System.out.println(booklist);
	  Collections.sort(booklist,new BookNameComparator());
	  print(booklist);
	}
	public static void print(List<Book> args)
	{
		for(Book eachBook:args)
		{
			System.out.println(eachBook);
		
		}
	  
			  
	}
	

}
