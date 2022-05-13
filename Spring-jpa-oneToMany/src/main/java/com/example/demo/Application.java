package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.Utils.DoctorUtils;
import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(Application.class, args);
		
		DoctorUtils obj=ctx.getBean(DoctorUtils.class);
		
//		obj.create();
		
		obj.findAll();
	}
	
	@Bean
	public Doctor munna() {
		Doctor doc=new Doctor();
		
		doc.setDoctorId(104);
		doc.setDoctorName("Dhyan");
		doc.setPhoneNumber(9874512478l);
		doc.setDepartment("Oncology");
		
		return doc;
	}
	
    @Bean
    public Patient kiran() {
    	return new Patient(204,"Aradhana",8745218745l);
    }

}
