package com.Customer;

public class Customer {

	private int customerId;
	private String customerName;
	private long mobileNumber;
	private int numberOfItems;
	
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int customerId,String customerName,long mobileNumber,int numberOfItems) {
		
		super();
		this.customerId=customerId;
		this.customerName=customerName;
		this.mobileNumber=mobileNumber;
		this.numberOfItems=numberOfItems;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getcustomerName() {
		return customerName;
	}

	public void setcName(String customerName) {
		this.customerName = customerName;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public int getNumberOfItems() {
		return numberOfItems;
	}

	public void setNumberOfItems(int numberOfItems) {
		this.numberOfItems = numberOfItems;
	}


}
