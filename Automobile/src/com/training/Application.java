package com.training;

public class Application {

	public static void main(String[] args) {
		
      ObjectFactory obj=new ObjectFactory();
      Automobile Maruti=obj.getObject(1);
      Automobile Toyota=obj.getObject(2);
      obj.printQuote(Maruti);
      obj.printQuote(Toyota);
     
      
    
	}

}
