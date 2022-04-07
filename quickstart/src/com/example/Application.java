package com.example;

import com.example.model.Student;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Student ram= new Student();
      //  ram.rollNumber=101;
        //public method is able to access.
        ram.setRollNumber(56020);
        //default(void) method unable to access.
        //because student class is in .com.example.mode package.
        //application is in another package.
        ram.setFirstName("Ram");
        //unable to access because application is not a subclass of student.
        ram.setMarkScored(580);
        
        ram.setBranch("BE");
        //unable to access because the method is private in student class 
        System.out.println("roll number:"+ram.getRollNumber());
        System.out.println("mark scored:"+ram.getMarkScored());
        System.out.println("first name:"+ram.getFirstName());
        
        Student shyam = new Student(49,"shyam", 89,"MECH");
        
        System.out.println("roll number:"+shyam.getRollNumber());
        System.out.println("Student name:"+shyam.getFirstName());
        
        Student magesh=new Student(988,"subramani","textilre");
        
        magesh.
        
        
            System.out.println("Roll NUMBER:"+magesh.getRollNumber());
        System.out.println("mark scored:"+magesh.getMarkScored());
        
	}

}
