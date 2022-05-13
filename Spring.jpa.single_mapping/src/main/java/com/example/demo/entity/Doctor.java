package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name="jasna_doctor")//class=table

@Data //getter setter
@AllArgsConstructor //constructor-super & field
@NoArgsConstructor 
public class Doctor {
	
	
	@Id
	@Column(name="doctor_id")
	int doctorId;
	
	@Column(name="doctor_name")
	String doctorName;
	
	@Column(name="department")
	String department;

	@Column(name="phone_number")
	long phoneNumber;
}
