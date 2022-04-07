package com.training;

public class  MarutiCar implements Automobile {

	@Override
	public String getColor() {
		
		return "BLACK";
		
	}

	@Override
	public String getModel() {
		
		return "SUZUKI";
	}

	@Override
	public int getPrice() {
		
		return 500000;
	}

	@Override
	public String toString() {
return "MarutiCar [getColor()=" + getColor() + ", getModel()=" + getModel() + ", getPrice()=" + getPrice()
				+ "]";
	}
	

}
