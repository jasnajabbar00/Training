package com.task6;

public class SavingsAccount extends BankAccount {

	@Override
	public double Deposit(double amount) {
		
		return 0;
	}

	@Override
	public double Withdraw(double amount) {
	
		return 0;
	}

	public SavingsAccount() {
		super();
	
	}

	public SavingsAccount(double deposit, double minimumBalanace) {
		super(deposit, minimumBalanace);
	
	}
 
}
