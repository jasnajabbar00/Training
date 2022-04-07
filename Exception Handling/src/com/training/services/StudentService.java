package com.training.services;

import com.training.model.Student;

public class StudentService {

	private Student student;

	public StudentService() {
		super();
		
	}
         //Applying the handle rule of exceptional handling
	public StudentService(Student student) {
		super();
		this.student = student;
	}
	public String sendDetails() {
		
		String name=null;
         try {
         
		name=this.student.getFirstName();
		
         } catch(NullPointerException e) {
        	 
        	 System.err.println("Student object is not passed check again");
         }
         return name;
	}
	
	//Applying the declaring rule of exceptional handling
	
	public String findRank() throws Throwable{
		String grade="A";
		
		if(this.student.getMarkScored()>90) {
			grade="O";
		}
		return grade;
		
	}
}
