package com.training.model;
import com.training.model.Insurance;
import com.training.model.VehicleInsurance;
import com.training.model.LifeInsurance;


public class Application {

	public static void printPremium(Insurance object) {
		System.out.println("Premium="+object.calculatePremium());
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicleInsurance car=new VehicleInsurance(1010,"bean","car",2019);
		printPremium(car);
		
		LifeInsurance life =new LifeInsurance(1012,"dora",8);
		printPremium(life);
		
		String[] illness= {"bp","ent","thyroid"};
		HealthInsurance health=new HealthInsurance(1013,"beam",illness);
		printPremium(health);
	}

}
