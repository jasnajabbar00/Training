package com.task6;

public abstract class BankAccount {
	
	private double deposit;
	private double minimumBalanace;

	
	
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

   public BankAccount(double deposit, double minimumBalanace) {
		super();
		this.deposit = deposit;
		this.minimumBalanace = minimumBalanace;
	}

public double getDeposit() {
	return deposit;
}

public void setDeposit(double deposit) {
	this.deposit = deposit;
}

public double getMinimumBalanace() {
	return minimumBalanace;
}

public void setMinimumBalanace(double minimumBalanace) {
	this.minimumBalanace = minimumBalanace;
}
 
public abstract double Deposit(double amount);
public abstract double Withdraw(double amount);


	
}
