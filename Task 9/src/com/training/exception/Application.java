package com.training.exception;

public class Application {

	public static void main(String[] args) {
		
		Customer details=new Customer(100,"bean",6589131473L,"mrbean12@gmail.com");
		
          try {
	            details.setEmail(null);
        	  
          } catch (InvalidEmailException e) {
	e.printStackTrace();
  }
     
       }

  }
