package com.training.model;

public class HealthInsurance extends Insurance{

	private String[] preExistingDiseases;
	
	
	public HealthInsurance(int policyNumber, String policyHolderName, String[] preExistingDisease) {
		super(policyNumber, policyHolderName);
		this.preExistingDiseases = preExistingDisease;
	}

	public HealthInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}

    public HealthInsurance(int policyNumber, String policyHolderName) {
		super(policyNumber, policyHolderName);
		// TODO Auto-generated constructor stub
	}

    public String[] getPreExistingDisease() {
		return preExistingDiseases;
	}

    public void setPreExistingDisease(String[] preExistingDisease) {
		this.preExistingDiseases = preExistingDisease;
	}
    
	@Override
	public double calculatePremium() {
		
		double premium=10000;
		for(String eachItem : preExistingDiseases) { 
              String item=eachItem.toLowerCase();
              
			//if(eachItem.equalsIgnoreCase("bp")
			
              if(eachItem.equals("BP")||eachItem.equals("SUGAR")) {
				premium=15000;
			}
		}
		return premium;
	}
	
	
	

}
