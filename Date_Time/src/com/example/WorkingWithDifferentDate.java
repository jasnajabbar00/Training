package com.example;
import java.util.*;
import java.sql.*;
import java.sql.Date;
import java.time.*;

public class WorkingWithDifferentDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Date date1 = new java.util.Date();
		//java.sql.Date date2 = new java.sql.Date(10);
		System.out.println(date1);
		System.out.println(date1.getTime());
		//Step-2 UTIL date to SQL Date
		java.sql.Date date2 = new java.sql.Date(date1.getTime());
		System.out.println(date2);
		//step-3 SQL date to LocalDate
		LocalDate localDate = date2.toLocalDate();
		System.out.println(localDate.getDayOfWeek());
		System.out.println(localDate.getMonthValue());
		//step-4 Local date to sql Date
		java.sql.Date sqlDate2= java.sql.Date.valueOf(localDate);
		System.out.println("SQL Date 2:="+ sqlDate2);
		

	}

}