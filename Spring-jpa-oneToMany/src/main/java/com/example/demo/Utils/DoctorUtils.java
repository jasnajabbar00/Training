package com.example.demo.Utils;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;
import com.example.demo.repo.DoctorRepository;

@Component
public class DoctorUtils {

	@Autowired //to fetch data
	List<Patient> patientList;//LIST OF PATIENTS
	
	
	@Autowired
	Doctor doc;
	
	@Autowired
	DoctorRepository repo;
	
	public void create() { //instance of 3 beans that will inject to patient list
		
		doc.setPatientList(patientList);//doc will have all details+ patient details
		
		Doctor added=repo.save(doc);
		
		if(added!=null) {
			System.out.println("One Record Added");
	}
}
	public void findAll() {
		List<Doctor>doctors=repo.findAll();
     //	System.out.println(doctors);
		
		for(Doctor eachDoctor:doctors) {
			
			System.out.println("Doctor Name"+eachDoctor.getDoctorName());
			System.out.println("Department"+eachDoctor.getDepartment());
			
			List<Patient> patients=eachDoctor.getPatientList();
			
			for(Patient eachPatient:patients) {
				
				System.out.println("Patient Name:="+eachPatient.getPatientName());
			System.out.println("Phone Number:="+eachPatient.getPhoneNumber());
			System.out.println("------------------");
			}
		}
	}
}