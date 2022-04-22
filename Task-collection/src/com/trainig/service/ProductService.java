package com.trainig.service;
import java.util.*;
public class ProductService {

	private Set<Product> products;
	
	public Set<Product> getTopThree() {

		Iterator<Product> itr=products.iterator();
	       int count=0;
	       Set<product> newSet=
	
		
		
	}
	

	public ProductService() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductService(Set<Product> products) {
		super();
		this.products = products;
	}
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	@Override
	public String toString() {
		return "ProductService [products=" + products + "]";
	}
	
}
