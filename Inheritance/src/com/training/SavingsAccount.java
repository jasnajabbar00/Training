package com.training;

import com.training.model.BankAccount;

//whenever sub class constructor is called super class constructor also called if class is not present
   public class SavingsAccount extends BankAccount {
	
	public SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String nominee;
	
	public String getNominee() {
		return nominee;
	}

	public void setNominee(String nominee) {
		this.nominee = nominee;
	}

	public SavingsAccount(int accountNumber, String accountHolderName, double balance, String accountType,
			String nominee) {
		super(accountNumber, accountHolderName, balance, accountType);
		this.nominee = nominee;
	}
	
//	public SavingsAccount() {
//		
//		System.out.println("Constructor Of SUB CLASS Called");
//	
//	public SavingsAccount() {
//		
//		super(1020,"ram",5000);
//		System.out.println("CONCTUCTOR OF SUB CLASS IS CALLED");
}
