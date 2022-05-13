package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import com.example.demo.entity.Doctor;
import com.example.demo.service.DoctorService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(Application.class, args);
	
		Doctor siva=ctx.getBean(Doctor.class);
		
		DoctorService service=ctx.getBean(DoctorService.class);
		
		Doctor added=service.add(siva);
		
		if(added!=null) {
			System.out.println("One Doctor Addedd");
		}
		System.out.println("--------find by-------------");
		   service.findAll().forEach(System.out::println);
	
		System.out.println("--------findby Dept-------------");
          service.findByDepartment("ENT").forEach(System.out::println);
		
	     System.out.println("---------find by docName------");
	       service.findByDoctorName("siva").forEach(System.out::println);	
	      
        System.out.println("-------find by name and dept------");
          service.findByDoctorNameAndDepartment("siva","ENT");
      
		System.out.println("----find by name or dept----------");
	    	service.fingByNameOrDepartment("siva","ENT").forEach(System.out::println);
	      ctx.close();
	}
	@Bean
	public Doctor siva() {
          return new Doctor(2020,"siva","ENT",9856321478l); 
			}
}
