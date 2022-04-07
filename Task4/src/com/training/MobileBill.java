package com.training;

public class MobileBill {

	private String customerName;
	private long mobileNumber;
	private String planName;
	private Address address;
    
	public static final String BRAND="AIRTEL";
    
	public MobileBill() {
		super();
			}
   
	public MobileBill(String customerName, long mobileNumber, String planName,Address address) {
		super();
	
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
		this.planName = planName;
		this.address=address;
	}
    
	public String getCustomerName() {
		return customerName;
	}
    
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
    public long getMobileNumber() {
		return mobileNumber;
	}
    
    public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
    
    public String getPlanName() {
		return planName;
	}
    
    public void setPlaneName(String planeName) {
		this.planName = planeName;
	}
    
    public Address getAddress() {
		return address;
	}
    
    public void setAddress(Address address) {
		this.address = address;
	}
    
	int amount;
 public int calculateAmount()
 {	
	switch (planName)
	{
		case "prepaid":
			amount=200;
			break;
			
		case "postpaid":
			amount=300;
			break;
	}
	return amount;
}	
}