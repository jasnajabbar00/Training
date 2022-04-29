package com.training.ifaces;


import java.util.List;

import com.training.model.Book;
import com.training.service.BookService;

public interface crudRepository {
	public boolean add(Book book);
	public Book findBy(int id);
	public boolean remove(Book book);
	public List<Book> findAll();
	public Book update(Book oldbook,Book recentBook);
	

}