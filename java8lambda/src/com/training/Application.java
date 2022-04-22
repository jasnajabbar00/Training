package com.training;

import com.trining.sevices.CurrencyConverter;

import java8lambda.Converter;

public class Application {
	
	public static void print(Converter<Double,Double> conv) {
		System.out.println(conv.convert(100.00));//method in converter
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Converter<Double,Double> obj=new CurrencyConverter();
	print(obj);
	System.out.println(obj.convert(20.0));
	
	Converter<Double,Double> lambda=(val)->val*20.0;//create lambda
	System.out.println(lambda.convert(20.00));
	
	Converter<String,Integer> strLength=(str)->str.length();
	System.out.println(strLength.convert("chennai"));
}
}