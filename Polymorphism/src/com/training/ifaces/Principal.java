package com.training.ifaces;

public class Principal implements Conditional {
	
	private String typeOfCollege;

	public Principal() {
		super();
		
	}

	public Principal(String typeOfCollege) {
		super();
		this.typeOfCollege = typeOfCollege;
	}

	public String getTypeOfCollege() {
		return typeOfCollege;
	}

	public void setTypeOfCollege(String typeOfCollege) {
		this.typeOfCollege = typeOfCollege;
	}

	@Override
	public boolean test(Object value) {
		
		String strLocation=(String)value;
		
		boolean result=false;
		
		if(this.typeOfCollege.equals("engg") && strLocation.equals("rural")) {
			result=true;
		}
		return result;
	}
	
	

}
