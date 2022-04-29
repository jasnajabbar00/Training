package com.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ram = new Student(101,"ram",LocalDate.of(1995, 4, 22),LocalDateTime.of(2001, 5, 22, 9, 30));
		Student shyam = new Student(101,"shyam",
			LocalDate.now(),LocalDateTime.now());
		System.out.println("rams years of birth:"+ram.getDateofBirth());
		System.out.println("Rams years of Birth"+ram.getDateofBirth().plus(1,ChronoUnit.YEARS));
		System.out.println("shyam year of birth:" +shyam.getDateofBirth().getYear());
		System.out.println("shyam sixty birthdy:" +shyam.getDateofBirth().plus(2,ChronoUnit.YEARS));
		System.out.println("shyam previous birthday"+shyam.getDateofBirth().minus(2,ChronoUnit.MONTHS));
		System.out.println(ram.getDateofBirth().plus(4,ChronoUnit.MONTHS));


	}

}
