package com.training.ifaces;

import com.training.utils.ObjectFactory;
import com.training.ifaces.Conditional;

public class NewObjectFactory extends ObjectFactory {

	@Override
	public Conditional getConditional(int key) {
		Conditional obj=null;
		if(key==3) {
			
			obj= new Principal("Private");
		}
		else
		{
			obj=super.getConditional(key);
		}
		
		return obj;
	}
        
	
}
