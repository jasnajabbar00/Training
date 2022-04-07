package com.training.service;

import com.training.model.BankAccount;
import com.training.service.BankAccountService;



public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccountService service=new BankAccountService();
		
		BankAccount ram=new BankAccount(5000,"rajesh",5000);
		
		double simpleInterest1=service.calculateInterest(ram);
		
		System.out.println("Simple interst @6%="+ simpleInterest1);
		
		
		BankAccount shyam=new BankAccount(6200,"ramesh",5000);
		
		double simpleInterest2=service.calculateInterest(shyam);
		
		System.out.println("Simple interest @5%="+ simpleInterest2);
		
	/*	BankAccount[] accounts= new BankAccount[2];
		
		accounts[0]=ram;
		accounts[1]=shyam;                                             short cut/declaration and initialization in single line
		
		service.calculateInterest(accounts);*/
		
		BankAccount[] accounts= {ram,shyam}; 
		service.calculateInterest(accounts);
		
		double[] values= service.findInterest(accounts);
		
		for(double eachValue : values ) {
			System.out.println(eachValue);
		}
         BankAccount[] accountList= {
        		 new BankAccount(800,"jay",5000,"savings"),
        		 new BankAccount(801,"tom",6000,"fixed"),
        		 new BankAccount(802,"jerry",7000,"recurring")
        	 };
         double[] interestValues=service.findInterestByAccountType(accountList);
         
         for(double eachValue: interestValues) {
        	 System.out.println(eachValue);
         }
         
	}	
}
