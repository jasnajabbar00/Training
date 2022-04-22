package com.tarining;

import java.io.Serializable;

public class Book implements Comparable<Book>,Serializable {
	
	public  int bookNumber;
	private String bookName;
	private String author;
	private double price;
	private double discount;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bookNumber, String bookName, String author, double price,double discount) {
		super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
		this.discount=discount;
	}
	public int getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscount(double discount) {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount=discount;
		
	}
	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", bookName=" + bookName + ", author=" + author + ", price=" + price
				+ ", getBookNumber()=" + getBookNumber() + ", getBookName()=" + getBookName() + ", getAuthor()="
				+ getAuthor() + ", getPrice()=" + getPrice() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
public int compareTo(Book otherObj)
{
	if(otherObj.bookNumber<this.bookNumber) return -1;

	if(otherObj.bookNumber<this.bookNumber) return 1;
	return bookNumber;

	
	//return otherObj.bookName.compareTo(this.bookName);
}
	
}