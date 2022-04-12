package com.training.service;

import java.util.ArrayList;
import com.training.model.Book;
import com.training.model.CrudRepository;
import java.util.List;

public class BookService implements CrudRepository {

	private ArrayList<Book> booklist;
	
	
	
	public BookService() {
		super();
		this.booklist =new ArrayList<>();
	}

	@Override
	public boolean add(Book book) {                 //boolean result=booklist.add(book);
		                                            //return result;
			return booklist.add(book); //indirectly returning boolean
	}

	@Override
	public Book findBy(int id) {
		
		Book found=null;
		for(Book eachBook:this.booklist) {
			
			if(eachBook.getBookNumber()==id) {
				found=eachBook;
			}
		}
		
		return found;
	}

	@Override
	public boolean remove(Book book) {
	
		return false;
	}

	@Override
	public List<Book> findAll() {
		
		return this.booklist;
	}

	@Override
	public Book update(Book oldBook,Book newBook) {
		
		if(this.booklist.contains(oldBook)) {
			
			//System.out.println("Inside if block######");
			int idxPos=this.booklist.indexOf(oldBook);
			
			this.booklist.set(idxPos,newBook);
			
			
		}else {
		
		//	System.out.println("Inside else block#########");
			add(newBook);                     // 	this.booklist.add(book);
		}
		return null;
	}

}
