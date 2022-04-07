package com.training;

import java.util.Scanner;

import com.training.model.Student;
import com.training.services.ExceptionHandling;
import com.training.services.StudentService;

public class Application 
{

	public static void main(String[] args) 
	{
		
		Student ram=new Student(1010,"dora",98);
		
		StudentService service=new StudentService(ram);
		
		System.out.println(service.sendDetails());
		
		StudentService service2=new StudentService();
		
		try {
			System.out.println(service2.findRank());
		} catch (Throwable e) {
			
			//e.printStackTrace();
			System.err.println("Name is not passed"); 
			}
		ExceptionHandling exHandling=new ExceptionHandling();
		
//		exHandling.usingArrayIndexException(args);
//		exHandling.usingNumberFormatException("45");
		System.out.println(exHandling.usingStandFinallyBlock());
		
		try (Scanner scan=new Scanner(System.in)){
			
			System.out.println("Enter Number");
            int num=scan.nextInt();
            
            System.out.println(num);
         
		} catch (Exception e) {
		   e.printStackTrace();
		}
}
}