package com.training.training;

import java.util.HashSet;

import com.training.Doctor;
import com.training.Patient;
import java.util.*;
public class Application2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Patient shyam=new Patient(101,"shyam","chennai",9856214587L);
	  Patient raju=new Patient(102,"raju","puducherry",8452145987L);
      Patient ram=new Patient(103,"ram","kochi",9852103475L);
	  Patient dora=new Patient(104,"dora","mahe",8452301475L);
	  
         Set<Patient> patient1=new HashSet<>();
         patient1.add(shyam);
         patient1.add(raju);
         
            Set<Patient> patient2=new HashSet<>();
            patient2.add(ram);
            patient2.add(dora);
            
            HashMap<Doctor,Set<Patient>> list1=new HashMap<>();
         
            
    Doctor doctor1=new Doctor(102,"Aarav","Cardiologist",patient1);
    Doctor doctor2=new Doctor(100,"Aadhil","Gynecologist",patient2);
    
         list1.put(doctor1,patient1);
         list1.put(doctor2, patient2);
         
         Appoinment appoinment=new Appoinment(12,list1);
         System.out.println(appoinment.getDetails(doctor1));
         
           
         
	}
	}


