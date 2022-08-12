package com.training;
import com.training.CreditCard;

public class CreditCardService 
{
	
	public boolean addCard(CreditCard card)
	{
		int i=0;
		CreditCard[] cards = new CreditCard[1];
		for(CreditCard eachcards : cards)
		{
			cards[i]=card;
			
		}
		return true;
	}
	
	public CreditCard[] getCards()
	{
		
		return null;
	}


	
	
}
