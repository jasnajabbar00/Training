package com.training;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;
import com.training.model.*;

public class UsingStreams {
public static void useDistinct(List<Book> bookList) {
	bookList.stream().distinct().forEach(System.out::println);
	
}
//list to set
public static void collectToSet(List<Book> bookList) {
	Set<Book> bookSet=
			bookList.stream()
			.filter(e->e.getPrice()>500)
			.collect(toSet());
	bookSet.forEach(System.out::println);
}
public static void collectToMap(List<Book> bookList)
{
//	Set<Book> bookSet= bookList.stream().collect(toSet());
			
	Map<String,Double> values = bookList.stream()
	.filter(e->e.getPrice()>500).distinct()
	.collect(toMap(Book::getBookName, Book::getPrice));
	values.forEach((key,value) -> System.out.println(key +"," +value));
	
}
public static void findMaxPrice(List<Book> bookList) {
	Optional<Book> optional =
			bookList.stream().max(Comparator.comparing(Book::getPrice));
	if(optional.isPresent()) {
		System.out.println("Maximum price"+optional.get().getPrice());
	}
	
}
public static void findMinPrice(List<Book> bookList) {
	Optional<Book> optional =
			bookList.stream().min(Comparator.comparing(Book::getPrice));
	if(optional.isPresent()) {
		System.out.println("Minimum price"+optional.get().getPrice());
	}
	
}
//public static void findcount(List<Book>bookList>
public static void findcount(List<Book> bookList, String srchString) {
	long count= bookList.stream()
			//.filter(e->e.getBookName().contains(v).count();
			.filter(e->e.getBookName().contains(srchString)).count();
	System.out.println(srchString + ":occurs-" + count +"times");
	//System.out.println("count:"+count);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book java = new Book(101,"java","suba",450);
		Book spring  = new Book(102,"spring","pavi",550);
		Book maven = new Book(103,"maven","sush",650);
		Book html = new Book(104,"html","anu",750);
		Book python = new Book(105,"python","sutha",1450);
		Book javanew = new Book(101,"java","suba",450);
		Book springnew  = new Book(102,"spring","pavi",550);
		Book mavennew = new Book(103,"maven","sush",650);
		List<Book> bookList=
				Arrays.asList(java,spring,maven,html,python,javanew,springnew,mavennew);
		System.out.println("---------------------------------");
		useDistinct(bookList);
		System.out.println("-----------------------------------------");
		collectToSet(bookList);
		System.out.println("-------------------------------------");
		collectToMap(bookList);  
		System.out.println("------------------------");
		findMaxPrice(bookList);
		System.out.println("-----------------------");
		findMinPrice(bookList);
		System.out.println("---------------");
		findcount(bookList,"v");

	}

}