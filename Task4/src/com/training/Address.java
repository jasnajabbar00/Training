package com.training;

public class Address {

	 private int doorNumber;
	 private String streetName;
	 private String location;
	
	 public Address() {
		super();
	
	}

	public Address(int doorNumber, String streetName, String location) {
		super();
		this.doorNumber = doorNumber;
		this.streetName = streetName;
		this.location = location;
	}

	public int getDoorNumber() {
		return doorNumber;
	}

	public void setDoorNumber(int doorNumber) {
		this.doorNumber = doorNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.doorNumber+","+this.streetName+","+this.location;
	}
	 
	 
}
