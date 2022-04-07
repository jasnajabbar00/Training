package com.training.services;
import com.training.SavingsAccount;
import com.training.model.BankAccount;
import com.training.services.BankAccountService;

public class SavingsAccountService extends BankAccountService {
	
	public String getCustomerInfo(SavingsAccount account) {

		return account.getAccountHolderName();
	}
	//	@override
		public double calculateInterest(BankAccount account) {
		double simpleInterest=0.05;
		if(account.getAccountNumber()<=5000) {
			
			simpleInterest=0.06;
		}
		return account.getBalance()*1*simpleInterest;
		}
	}


