package com.training;
import com.training.model.BankAccount;
import com.training.services.BankAccountService;
import com.training.services.SavingsAccountService;

public class Application {

	public static void main(String[] args) {

      BankAccount ramsaccount=new BankAccount(1010,"ramesh",50000,"savings");
  
		 System.out.println(ramsaccount.toString());
	
	  SavingsAccount account=new SavingsAccount(650,"RAMESH",678,"joint","rajesh");
	
    	 System.out.println(account.getAccountHolderName());
	     System.out.println(account.getNominee());
	
   	  SavingsAccountService service=new SavingsAccountService(); 
	
	    System.out.println(service.getCustomerInfo(account));
	    System.out.println(service.calculateInterest(account));
	
	  BankAccountService service2=new SavingsAccountService();
	
	//cannot access sub class method with super class reference
	//service2.getCustomerInfo(account);
	
	 SavingsAccountService savingService2=(SavingsAccountService)service2;
        
	 BankAccountService sc2= new BankAccountService();
	
	    System.out.println(savingService2.getCustomerInfo(account));
	}
}
