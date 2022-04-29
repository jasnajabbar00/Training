package com.example;
import java.time.*;
public class Student {
	private int rollNumber;
	private String studentName;
	private LocalDate dateofBirth;
	private LocalDateTime dateofJoining;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNumber, String studentName, LocalDate dateofBirth, LocalDateTime dateofJoining) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.dateofBirth = dateofBirth;
		this.dateofJoining = dateofJoining;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public LocalDate getDateofBirth() {
		return dateofBirth;
	}
	public void setDateofBirth(LocalDate dateofBirth) {
		this.dateofBirth = dateofBirth;
	}
	public LocalDateTime getDateofJoining() {
		return dateofJoining;
	}
	public void setDateofJoining(LocalDateTime dateofJoining) {
		this.dateofJoining = dateofJoining;
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", studentName=" + studentName + ", dateofBirth=" + dateofBirth
				+ ", dateofJoining=" + dateofJoining + "]";
	}
	
}