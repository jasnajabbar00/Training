package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;


@FieldDefaults(level = AccessLevel.PRIVATE)


@Component
@Getter
@ToString

@NoArgsConstructor
public class Bill {
	
	
	
		Product product;
		Customer customer;
		
		@Autowired
		public void setProduct(Product product) {
			System.out.println("Set Product is called");
			this.product = product;
		}
		@Autowired
		public void setCustomer(@Qualifier("anju")Customer customer) {
			System.out.println("Set customer is called");
			this.customer = customer;
		}
		
		
	}
