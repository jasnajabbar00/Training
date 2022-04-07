package com.Hotel;

public class Hotel {

	  private String hotelName;
	  private int profit;
	  private String location;
	  private String Cuisine;
	  
//constructor with default parameter
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hotel(String hotelName, int profit, String location, String cuisine) {
		super();
		this.hotelName = hotelName;
		this.profit = profit;
		this.location = location;
		this.Cuisine = cuisine;
	}
	public String gethotelName() {
		return hotelName;
	}
	public void sethotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public int getProfit() {
		return profit;
	}
	public void setProfit(int profit) {
		this.profit = profit;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCuisine() {
		return Cuisine;
	}
	public void setCuisine(String cuisine) {
		Cuisine = cuisine;
	}
	  
	  
	}
