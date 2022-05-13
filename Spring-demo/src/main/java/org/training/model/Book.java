package org.training.model;

import org.springframework.stereotype.Service;


@Service

public class Book {
	public double getDiscount(String ookName) {
		return 0.10;
	}


}