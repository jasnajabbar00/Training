package com.training;

import com.training.services.Discountcalculator;
import com.training.sevices.CurrencyConverter;
import com.training.ifaces.CheckCondition;
import com.training.ifaces.Conditional;
import com.training.ifaces.Function;

public class Application {

	public static void main(String[] args) {
		
		
		//CurrencyConverter conv=new CurrencyConverter();
		Function conv=new CurrencyConverter();
		
		double response=conv.apply(200);
		
		System.out.println(Function.COUNTER);
		
		System.out.println(response);
		
		System.out.println(conv.apply(300));//line 11,13,15 identical
	
	   if(conv instanceof CheckCondition) {
		   
		   CheckCondition obj=(CheckCondition)conv;
		
		System.out.println("Is Discount Allowed:"+obj.test(300));
		
	}else {
		System.out.println("cannot be cast");
	}
	
	   Conditional condobj=new Discountcalculator();
	   
	   System.out.println(condobj.test(6000));
	   System.out.println(condobj.negate(6000));
		
	}
}
