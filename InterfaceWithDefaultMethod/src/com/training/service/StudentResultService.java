package com.training.service;

import com.training.ifaces.AgeCondition;
import com.training.ifaces.Conditional;

public class StudentResultService implements Conditional<Double>,AgeCondition {

	@Override
	public boolean test(Double t) {
		// TODO Auto-generated method stub
		return t>70;
	}
	@Override
	public boolean negate(Double value) {
		//completely oveeriding supertype with cuustom type
		if(value>100) {
			return true;
		}else {
			return false;
		}
		//calling one of the super type
		//return Conditional.super.negate(value);
//		boolean result1=Conditional.super.negate(value);
//		//return result1;
//		boolean result2=AgeCondition.super.negate(value);
//		//return result2;\
		
//		if(result1&& result2) {
//			return true;
//		}
//		else {
//			return false;
//		}
	}
	

}