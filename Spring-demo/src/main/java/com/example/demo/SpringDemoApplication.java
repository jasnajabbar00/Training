package com.example.demo;

import java.awt.print.Book;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.training.model.Author;

import com.example.demo.model.Bill;
import com.example.demo.model.CustomerList;
import com.example.demo.model.Invoice;
import com.example.demo.model.Student;
import com.example.demo.model.Teacher;

//Spring entry point

@SpringBootApplication
@ComponentScan(basePackages = {"org.training","com.example"})

public class SpringDemoApplication {
	public static void sample() {
		//for method level
		ApplicationContext ctx=null;
				
				//When Using Id Need to cast to specific Bean since 
				//return type of getBean Method is Object
				
				System.out.println(ctx.getBean("pavi"));
				
				//for class level
				
				//Casting not requred, but there should be one bean of that type
				//will throw Exception
				
				//Teacher shyam= ctx.getBean(Teacher.class);
				
				//when More than one bean of the same Type Available 
				//Should use id and class name
				
				Teacher stella = ctx.getBean("stella",Teacher.class );
				
				stella.setId(494);
				stella.setName("Stella Sundari");
				stella.setSubject("fluid mech");
				
				//System.out.println(ctx.getBean("harish"));
				
				//System.out.println(stella);
				
			}

// main method ku  args la enna argument pass pandromo athu tha run args kum pass akum..
	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringApplication.class, args);
		
		Invoice inv = ctx.getBean(Invoice.class);
		
		//System.out.println(ctx.getBean(Book.class));
		
		System.out.println("author:="+ctx.getBean(Author.class));
		
		System.out.println(inv);

		
		
		Bill bill = ctx.getBean(Bill.class);
		
	    System.out.println("customer="+bill.getCustomer());
		System.out.println("product="+bill.getProduct());
		
//		CustomerList list = ctx.getBean(CustomerList.class);
//		list.getCustList().forEach(System.out::println);
		
		
		
	}	
	@Bean 
	public Author ravi() {
		return new Author(101,"raj");
	}
	
	@Bean
	@Primary
	public Author mari() {
		return new Author(101,"Maya");
	}

}
