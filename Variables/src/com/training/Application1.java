package com.training;

public class Application1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount account=new BankAccount("ramesh",1000);
		
		System.out.println(account.getUpdatedBalance(2000));
		System.out.println(account.getaccountNumber());
		

	BankAccount account2=new BankAccount("rama",2000);

	System.out.println(account2.getUpdatedBalance(2000));
	System.out.println(account2.getaccountNumber());
	}
}
