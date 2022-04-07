package com.task2.mainMethod;

import com.Customer.*;
import com.Employee.*;
import com.Hotel.*;

public class Task2_Main {

	   public static void main(String[] args) {
		   Employee_Service obj4=new Employee_Service();
		   
		   Customer obj1=new Customer(11,"Ramu",9875522268L,5);
		   Employee obj2=new Employee(180467,60000,09.00,07.00);
		   Hotel obj3=new Hotel("Favourite spot",100000,"kochi","Multi_Cuisine");
		   
		   System.out.println(obj1.getCustomerId());
		   System.out.println(obj1.getcustomerName());
		   System.out.println(obj1.getMobileNumber());
		   System.out.println(obj1.getNumberOfItems());
		   
		   System.out.println(obj2.getEmpId());
		   System.out.println(obj2.getSalary());
		   System.out.println(obj2.getShiftStart());
		   System.out.println(obj2.getShiftEnd());
		   
		   System.out.println(obj3.gethotelName());
		   System.out.println(obj3.getProfit());
		   System.out.println(obj3.getLocation());
		   System.out.println(obj3.getCuisine());
		   System.out.println(obj4.calculateBonus(obj2));
		   
	   }
}
