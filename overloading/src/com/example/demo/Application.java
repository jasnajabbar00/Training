package com.example.demo;
import java.util.*;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the name");
		
		String name=sc.next();
		
		Converter obj=new Converter();
		
		System.out.println(obj.convert(name));

		System.out.println("Enter the farenheit temp");
		
		double farenTemp=sc.nextDouble();
		System.out.println("Celcius temp:"+obj.convert(farenTemp));
		
		System.out.println("Enter the amount");
		double amt=sc.nextDouble();
		
		System.out.println("Enter the current to convert 1-USD 2-EURO");
		int frm=sc.nextInt();
		
				System.out.println(obj.convert(amt,frm));
				
		sc.close();
	}

}
