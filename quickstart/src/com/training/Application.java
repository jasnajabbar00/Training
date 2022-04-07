package com.training;

public class Application {

	public static void main(String[] args) {
		Greeting grtObj=new Greeting();
		System.out.println(grtObj.getMessage());
		System.out.println(Greeting.getInfo());
		//System s=new System(); private-constructor class
	
		//System.out.println(grtObj.getInfo());
		System.out.println(Greeting.getInfo());
	}
	}


