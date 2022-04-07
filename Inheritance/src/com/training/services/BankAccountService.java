package com.training.services;

import com.training.model.BankAccount;

public class BankAccountService {

	public double calculateInterest(BankAccount account) {
		double simpleInterest=0.05;
		if(account.getAccountNumber()<=5000) {
			
			simpleInterest=0.06;
		}
		return account.getBalance()*1*simpleInterest;
		
		
	}

	public BankAccountService() {
		super();
		// TODO Auto-generated constructor stub
	}
	//overloaded method
	public void calculateInterest(BankAccount[] accounts) {

	for(BankAccount eachAccount: accounts) {      //eachAccount-identifier

	System.out.println(calculateInterest(eachAccount));
	}
	}
	
	public double[] findInterest(BankAccount[] accounts) {                             //any size array
		
		        double[] values= new double[2];                                //to declare array
	            int i=0;
		        
		        for(BankAccount eachAccount:accounts) {
		         values[i]=calculateInterest(eachAccount);
		         i++;
	}
		          return values;
	}
	private double calculateByAccountType(BankAccount accounts,double rateOfInterest)
	{
//		String type=accounts.getAccountType();
//				double rateOfInterest=0.07;
//		if(type.equals("savings")) {
//			rateOfInterest=0.05;
//		}
//		if(type.equals("fixed")||type.equals("recurring")) {
//			rateOfInterest=0.06;
//		}
//		return rateOfInterest;
		return accounts.getBalance()*1*rateOfInterest;
	}

	public double[] findInterestByAccountType(BankAccount[] accounts) {

		System.out.println("Account type:"+accounts.length);
		double[] values=new double[accounts.length];
	
		for(BankAccount eachAccount : accounts) {
			int i=0;
			String key=eachAccount.getAccountType();
			switch(key){
			case "savings":
				 values[i]=calculateByAccountType(eachAccount,0.05);
				 break;
			case "fixed":
				 values[i]=calculateByAccountType(eachAccount,0.07);
                 break;
	    	case "reccuring":
				 values[i]=calculateByAccountType(eachAccount,0.07);
                 break;
			}
			i++;
		}
		return values;
	}
}
