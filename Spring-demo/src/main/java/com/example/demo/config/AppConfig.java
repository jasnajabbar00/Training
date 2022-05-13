package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Customer;
import com.example.demo.model.Product;
import com.example.demo.model.Student;
import com.example.demo.model.Teacher;

@Configuration
public class AppConfig {
	
	//id of the beam as the method name
	@Bean
	public Student pavi() {
		return new Student(101,"jasna",89);		
	}
	
	@Bean
	public Teacher harish() {
		return new Teacher(4800,"harish","ComputerScience");
		
	}
	@Bean
	public Product tv() {
		return new Product(101,"kochu tv");
	}
	@Bean
	public Customer anju() {
		return new Customer(1001,"anjal");
	}
	@Bean
	public Customer abi() {
		return new Customer(1002,"abhin");
	}
	@Bean
	public Customer anu() {
		return new Customer(1003,"ananya");
	}
	
	


}