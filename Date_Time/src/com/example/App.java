package com.example;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class App {
	public static void main(String[]args) {
	String dateofBirth = "1998-08-23";
	Student vicky = new Student();
	vicky.setRollNumber(200);
	vicky.setStudentName("pavi");
	vicky.setDateofBirth(LocalDate.parse(dateofBirth));
	vicky.setDateofJoining(LocalDateTime.now());
	System.out.println("year"+vicky.getDateofBirth().getYear());
	//System.out.println("Month="+vicky.getDateofBirth().getMonthValue());
	System.out.println("month="+vicky.getDateofBirth().getMonth());
	System.out.println("Day="+vicky.getDateofBirth().getDayOfMonth());
	
	LocalTime startTime = LocalTime.of(9,30);
	//Duration duration = Duration.of(8, ChronoUnit.HOURS);
	LocalTime endTime = startTime.plus(8,ChronoUnit.HOURS);
	System.out.println("startTime"+startTime);
	System.out.println("EndTime:"+endTime);
	
	}

}