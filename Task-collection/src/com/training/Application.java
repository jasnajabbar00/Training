package com.training;
import java.util.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Patient shyam=new Patient(101,"shyam","chennai",9856214587L);
		Patient raju=new Patient(102,"raju","puducherry",8452145987L);
		Patient ram=new Patient(103,"ram","kochi",9852103475L);
	    Patient dora=new Patient(104,"dora","mahe",8452301475L);
            HashSet<Patient> patients=new HashSet<>();
           
            patients.add(shyam);
            patients.add(raju);
            patients.add(ram);
            patients.add(dora);
            
            Doctor doctor=new Doctor(100,"Aarav","Cardiologist",patients);
            
           for(Patient eachPatient:doctor.getList())
           {
            	System.out.println(eachPatient);
           }
	}
 }
