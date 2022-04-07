package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Integer value=Integer.parseInt(args[0]);
//        System.out.println(args[0]);
//        
//        System.out.println(args[1]);
//        System.out.println(args[2]);
//		
//        System.out.println(++value);
        CurrencyConverter conv = new CurrencyConverter();
        
        Double dblAmount=Double.parseDouble(args[0]);
        
       System.out.println(conv.inrToUsd(dblAmount));
       
       Double inrValue=Double.parseDouble(args[1]);
       
       System.out.println(conv.inrToEuro(inrValue));
       
       double salary=42500.00;
       int intSal=(int)salary;
       int age=21;
       
       String strAge=Integer.toString(age);
       int intAge=Integer.valueOf(strAge);
       	}

}

