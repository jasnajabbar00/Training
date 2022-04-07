package com.training.model;

public class BankAccount {

	private int accountNumber;
	private String accountHolderName;
	private double balance;
	
	private String accountType;
	
	public BankAccount() {
		super();
		System.out.println("Zero Arg constructor of SUPER CLASS Called");
		// TODO Auto-generated constructor stub
	}
//parameterized constructor
  
	public BankAccount(int accountNumber, String accountHolderName, double balance) { //removing will shown error
		super();
		System.out.println("Three Argu constructor of SUPER CLASS Called");
		
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	
	public BankAccount(int accountNumber, String accountHolderName, double balance, String accountType) {
	super();
	System.out.println("Four Arg constructor of SUPER CLASS Called");
	
	
	    this.accountNumber = accountNumber;
    	this.accountHolderName = accountHolderName;
	    this.balance = balance;
	    this.accountType = accountType;
}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
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
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	

}
	
	

