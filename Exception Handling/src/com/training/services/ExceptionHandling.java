package com.training.services;

public class ExceptionHandling {

	public  void usingArrayIndexException(String[] args) {
		
		try {
		System.out.println(args[2]);
		} catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Methods requires three values to be passed[a,b,c]");
			e.printStackTrace();
		}
	}
           public void usingNumberFormatException(String value) {
        	   
        	   int age = 0;
        	   try {
        		  
        		   Integer.parseInt(value);
           	   
           } catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	   System.out.println(age);
           }
           
           public void usingFinallyBlock() {
        	   
        	   int denominator=4;
        	   try {
        		   System.out.println(4/denominator);
        	   }
        	   catch(ArithmeticException e) {
        		   System.err.println("Denominator should not be zero");
        		   
        	   }
        	   finally {
        		   System.out.println("Inside FINALLY===");
        	   }
        	   System.out.println("bye,bye");
           }
           public String usingStandFinallyBlock() {
        	   
        	   int denominator=4;
        	   try {
        		   System.out.println(4/denominator);
        	   }
        	   catch(ArithmeticException e) {
        		   System.err.println("Denominator should not be zero");
        		   return "welcome";
        	   }
        	   finally {
        		   System.out.println("Inside FINALLY===");
        	   }
        	   System.out.println("bye,bye");
        	   return "thanks";
           }
}
