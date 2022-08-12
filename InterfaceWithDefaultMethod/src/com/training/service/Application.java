package com.training.service;
import com.training.ifaces.Conditional;
import com.training.service.StudentResultService;
public class Application {

	public static void main(String[] args) {
		
		StudentResultService service= new StudentResultService();
		System.out.println("Is Pass: "+service.test(100.00));
		System.out.println("Is Fail: "+service.negate(90.00));
		System.out.println(Conditional.getMessage());

	}

}