package com.training;

public class Application {

	public static void main(String[] args) {
		
		Address address=new Address(21,"street4","mahe");
		MobileBill bill=new MobileBill("reshma",9845321762L,"postpaid",address);
		
		System.out.println(bill.calculateAmount());
        System.out.println(MobileBill.BRAND);
        System.out.println(bill.getCustomerName());
        System.out.println(bill.getMobileNumber());
        System.out.println(bill.getAddress());
	}

}
