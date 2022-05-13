package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="jasna_employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
		@Id
		@Column(name="employee_Id")
		int employeeId;
		
		@Column(name="employee_Name")
		String employeeName;
		
		@DateTimeFormat
		
		@Column(name="date_of_birth")
		LocalDate dateOfBirth;
		
		@Column(name="location")
		String location;
		
		@Column(name="skill_set")
		String skillSet;
		
		@Column(name="phone_number")
		long phoneNumber;
	}
	
	

