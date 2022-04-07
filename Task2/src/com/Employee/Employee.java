package com.Employee;

public class Employee {

	private int empId;
	private double salary;
	private double shiftStart;
	private double shiftEnd;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
//constructor
	public Employee(int empId, double salary, double shiftStart, double shiftEnd) {
		super();
		this.empId = empId;
		this.salary = salary;
		this.shiftStart = shiftStart;
		this.shiftEnd = shiftEnd;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getShiftStart() {
		return shiftStart;
	}

	public void setShiftStart(double shiftStart) {
		this.shiftStart = shiftStart;
	}

	public double getShiftEnd() {
		return shiftEnd;
	}

	public void setShiftEnd(double shiftEnd) {
		this.shiftEnd = shiftEnd;
	}
	
}
