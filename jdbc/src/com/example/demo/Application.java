package com.example.demo;
import java.sql.*;
import java.util.Optional;

import com.example.demo.entity.Product;
import com.example.demo.service.productService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
		
		System.out.println(con);
		
		productService service=new productService(con);
		
		Product toAdd=new Product(94,"ups",17470.00);
		
	//	int rowAdded=service.addProduct(toAdd);
		//System.out.println("Row Added:="+rowAdded);
		service.findAll().forEach(System.out::println);
		
		int rowsDelete=service.deleteById(113);
		System.out.println("Row Deleted:="+rowsDelete);
		service.findAll().forEach(System.out::println);
		
		Optional<Product> found=service.findById(94);
		
		if(found.isPresent()) {
			System.out.println("Given id is present"+found.get());
		}else {
			System.out.println("Product with given id is not present");
		}

		System.out.println("Price updated"+service.updatePriceByName("ICECREAM",65));
		service.findAll().forEach(System.out::println);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
