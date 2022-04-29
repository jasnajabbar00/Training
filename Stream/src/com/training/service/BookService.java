package com.training.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import com.training.ifaces.crudRepository;
import com.training.model.Book;
import static java.util.stream.Collectors.*;
public class BookService implements crudRepository{
	private ArrayList<Book> bookList;

	public BookService() {
		super();
		// TODO Auto-generated constructor stub
		this.bookList=new ArrayList<>();
}
 
	@Override
	public boolean add(Book book) {
		// TODO Auto-generated method stub
		return bookList.add(book);
	}


	@Override
	public boolean remove(Book book) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return this.bookList;
	}
	@Override
	public Book findBy(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book update(Book oldbook, Book newBook) {
		// TODO Auto-generated method stub
		if(this.bookList.contains(oldbook)) {
			int idxpos = this.bookList.indexOf(oldbook);
			this.bookList.set(idxpos, newBook);
		}
		else {
			
		}
		return null;
	}
	//using streams
	public List<Book>findBooksGrtThan(double price){
		//e=eachElement
		return this.bookList.stream()
				.filter((e)->e
						.getPrice()>price)
						.collect(toList());
	}
	
		
	public List<Book> getBookGrtThan(double price){
		//write using predicate and for each
		
		Predicate<Double>grtThan=(value)->value>price;
		List<Book>list=new ArrayList<>();
		this.bookList.forEach(book->
		{
			double bookPrice=book.getPrice();
			if(grtThan.test(bookPrice)) {
				bookList.add(book);
			}
		});
		return bookList;
	}
	public List<String> getBookNames(){
		return this.bookList
				.stream()
				.map(e->e.getBookName())
				.collect(toList());
		
	}
	public List<String> getBookNameGrtThanPrice(double price){
		return this.bookList
				.stream()
				.filter(e->e.getPrice()>price)
				.map(e-> e.getBookName())
				.collect(toList());
	}
	//stream using sort
	public List<Book> sortedByName(){
		return this.bookList
				.stream()
				.sorted(Comparator.comparing(Book::getBookName))
				.collect(toList());
	}
	public List<Book> reverseByNumberdesc(){
		return this.bookList
				.stream()
				.sorted(Comparator.reverseOrder())
				.collect(toList());
	}

	
	
}