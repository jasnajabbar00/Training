package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.Utils.bidirection.Utility;
import com.example.demo.entity.bidirectional.Doctor;
import com.example.demo.entity.bidirectional.Patient;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
ConfigurableApplicationContext ctx=SpringApplication.run(Application.class, args);
		
		Utility obj=ctx.getBean(Utility.class);
		
		obj.create();
		System.out.println("---------");
		
		obj.findAll();
		System.out.println("---------------");
		obj.findDoctorFromPatient();
	}
	
	@Bean
	public Doctor munna() {
		Doctor doc=new Doctor();
		
		doc.setDoctorId(104);
		doc.setDoctorName("Dhyan");
		doc.setPhoneNumber(9874512478l);
		doc.setDepartment("Oncology");
		System.out.println("----------");

		return doc;
	}
	
    @Bean
    public Patient kiran() {
    	return new Patient(204,"Aradhana",8745218745l);
    }
	}


