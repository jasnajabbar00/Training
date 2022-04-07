package com.training.ifaces;

import com.training.utils.ObjectFactory;
import com.training.ifaces.Conditional;

public class Application {

	public static void main(String[] args) {
	
		
		NewObjectFactory factory=new NewObjectFactory();
		
		Conditional profObj=factory.getConditional(1);
		
		Conditional studobj=factory.getConditional(2);
		
		System.out.println(profObj.test("chennai"));
		
		System.out.println("Allowance: " + factory.getValue(profObj,"chennai"));
        System.out.println("Allowance: " + factory.getValue(studobj,"90"));
	}
}
