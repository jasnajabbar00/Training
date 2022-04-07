package com.training;

public class ToyotaCar implements Automobile {

	@Override
	public String getColor() {
		
		return "RED";
	}

	@Override
	public String getModel() {
		
		return "SWIFT";
	}

	@Override
	public int getPrice() {
		
		return 700;
	}
	@Override
	public String toString() {
return "ToyotaCar [getColor()=" + getColor() + ", getModel()=" + getModel() + ", getPrice()=" + getPrice()
				+ "]";
	}

}
