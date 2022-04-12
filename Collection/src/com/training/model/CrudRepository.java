package com.training.model;

import java.util.*;

public interface CrudRepository {

	public boolean add(Book book);
    public Book findBy(int id);
    public boolean remove(Book book);
    public List<Book> findAll();
    public Book update(Book oldBook,Book recentBook);
}
