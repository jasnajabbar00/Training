package com.training;

public class BankAccount {

	//static variable
	private static int count;

	//instance variable
	private String accountHolderName;
	private double balance;
	private int accountNumber;
	//static method
	public static int getCount() {
	
	return ++count;
}
	public double getUpdatedBalance(double amount) {//parameter variable
		
		//local variable
		double updatedBalance=0.0;
		
		//local variable
		double currentBalance=0;
		//local variable should be initialize before use
		//System.out.println(updatedBalance);
		
		currentBalance=this.balance+amount;
		this.balance=currentBalance;		
		return currentBalance;
		
		//return 0;
	}
	
	public int getaccountNumber() {
		return accountNumber;
	}
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public BankAccount(String accountHolderName, double balance) {
		super();
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.accountNumber=getCount();
	}
	
}
