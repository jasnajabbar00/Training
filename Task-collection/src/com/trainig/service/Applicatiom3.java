package com.trainig.service;
import java.util.*;

public class Applicatiom3 {

	public static void main(String[] args) {
	
		Product lolypop=new Product(100,"lolypop",5);
		Product choclate=new Product(101,"choclate",100);
		Product teddybear=new Product(102,"TeddyBear",600);
		Product icecream=new Product(103,"Icecream",50);
		Product hairband=new Product(104,"Hairband",150);
		
		TreeSet<Product> set=new TreeSet<>();
		
		set.add(lolypop);
		set.add(choclate);
		set.add(teddybear);
		set.add(icecream);
		set.add(hairband);
		
	}

}
