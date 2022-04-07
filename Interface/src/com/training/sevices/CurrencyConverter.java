package com.training.sevices;

import com.training.ifaces.CheckCondition;
import com.training.ifaces.Function;

public class CurrencyConverter implements Function,CheckCondition { //override if it is not abstract class

	@Override
	public double apply(double value) {
		
		return value*100;
	}

	@Override
	public boolean test(int value) {
		
		return value>5000;
	}

	
}
