package com.example;

import java.sql.Connection;
import java.util.Optional;

import com.example.doa.CustomerService;
import com.example.entity.Customer;
import com.example.entity.loanApplication;
import com.example.util.ConnectionFactory;

public class App 
{
    public static void main( String[] args )
    {
      Connection con;
      try
      {
    	  con=ConnectionFactory.getOracleConnection();
    	  System.out.println(con);
    	  CustomerService custservice=new CustomerService(con);
    	  custservice.findAll().forEach(System.out::println);
    	  
    	  Optional<loanApplication> found=custservice.findById(2);
    	  if(found.isPresent()) {
    		  System.out.println("ID IS PRESENT"+found.get());
    	  }else {
    		  System.out.println("Id is not present");
    		  
    	  }
    	  Customer cust=new Customer(306,"Alice",9852364172l,450.00);
    	  loanApplication loanApp=new loanApplication(172,cust,65000.00);
    	  int rowAdded=custservice.add(loanApp);
    	 // int rowADD=custservice.add(rowAdd);
    	  //System.out.println("row added:"+rowAdded);
    	 System.out.println(rowAdded);
    	 custservice.findAll().forEach(System.out::println); 
    	  
      }catch(Exception e){
    	  e.printStackTrace();
      }
    }
}
