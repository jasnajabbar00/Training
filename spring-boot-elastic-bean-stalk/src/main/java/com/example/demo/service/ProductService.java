package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ifaces.ProductRepository;
import com.example.demo.model.Product;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repo;
	
	public ProductService(ProductRepository repo) {
		super();
		this.repo = repo;
	}
	
	public Product add(Product entity) {
		
		return this.repo.save(entity);
	}



	public List<Product> findAll() {

		return this.repo.findAll();
	}

}
