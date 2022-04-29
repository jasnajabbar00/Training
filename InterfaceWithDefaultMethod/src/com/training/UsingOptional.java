package com.training;

import java.util.Optional;

class UsingOptional {
	public static Optional<String> getValue(int key){
		Optional<String> response = Optional.empty();
		if(key==1) {
			response=Optional.of("hi");
		}
		return response;
	}
	public static Object getString(int key) {
		switch (key) {
		case 1:
			return new String ("chocobar");
		case 2:
			return new StringBuffer("cassatta");

		default:
			return null;
		}
	}
	public static void main(String args[]) {
		System.out.println(getString(1).toString());
		//will throw null pointer exception for values 3 and above
		//System.out.println(getString(3).toString());
		//to avoid nullpointer exception and return a default value
		//new feature of java8 optional is used
		Optional<Object> optional = Optional.ofNullable(getString(2));
		System.out.println(optional.orElse("Vannila").toString());
		
		//here we are checking if the value is present
		//it its present then only we will call get method
		Optional<Object> optional2 = Optional.ofNullable(getString(3));
		if(optional2.isPresent()) {
		System.out.println("value is present"+optional2.get());
		}else {
			System.out.println("value is not present");
		}
		//using the Lambeda Expression with Optional
		Optional<Object> optional3 = Optional.ofNullable(getString(3));
		//optional3.orElseThrow(
				//()-> new RuntimeException("No object for value 3 Try again"));
	
	//call the getValue method by passing 1 as argument
	//call the same Method again by passing 2 as argument
	Optional<String> resp = getValue(1);
	if(resp.isPresent()) {
		System.out.println(resp.get().toString());
	}
	else {
		System.out.println("Invalid Choice Enter1");
	}
}
}