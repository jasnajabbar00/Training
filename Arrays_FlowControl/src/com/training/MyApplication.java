package com.training;
import java.util.*;
import com.training.model.BankAccount;
import com.training.service.BankAccountService;

public class MyApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
          BankAccountService service=new BankAccountService();
            BankAccount[] list=new BankAccount[4];
            
            Scanner sc =new Scanner(System.in);

            String option="no";
        int i=0;
        do
      	 {
        	  BankAccount account=new BankAccount();
        	             	
             System.out.println("Enter account number:");
        	 int accountNumber=sc.nextInt();
          
             System.out.println("Enter account holder name:");
             String AccountHolderName=sc.next();
        	  
        	 System.out.println("Enter balance");
             double balance=sc.nextDouble();
             
        	 System.out.println("Enter account type");
        	 String AccountType=sc.next();
        	 
        	 BankAccount account1= new BankAccount(accountNumber,AccountHolderName,balance,AccountType);
        	 
        	 System.out.println("enter option to continue:");
        	 option=sc.next();
        	  
        	 list[i]=account;
        	 i++;
        	 
          }while(option.equals("yes"));
        service.findInterestByAccountType(list);
                  sc.close();
	}
}
