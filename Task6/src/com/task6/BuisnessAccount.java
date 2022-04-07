package com.task6;

public class BuisnessAccount extends BankAccount {

	@Override
	public double Deposit(double amount) {
	
		return 0;
	}

	@Override
	public double Withdraw(double amount) {
		
		return 0;
	}

	public BuisnessAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BuisnessAccount(double deposit, double minimumBalanace) {
		super(deposit, minimumBalanace);
		// TODO Auto-generated constructor stub
	}

}
