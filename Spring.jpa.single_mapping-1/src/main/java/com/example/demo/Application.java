package com.example.demo;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext  ctx=SpringApplication.run(Application.class, args);
		
		Employee goutham=ctx.getBean(Employee.class);

		EmployeeService service=ctx.getBean(EmployeeService.class);
		
		Employee added=service.add(goutham);
		
		if(added!=null) {
			System.out.println("One Doctor Added");
			
		}
		service.findAll().forEach(System.out::println);
		
		System.out.println("------find by DOB-------");
		service.findByDateOfBirth(LocalDate.of(2003,9,1)).forEach(System.out::println);
		
		System.out.println("------find by location-------");
		service.fingByLocation("chennai").forEach(System.out::println);
		
		System.out.println("---find by skillset------");
		service.findBySkillSet("html").forEach(System.out::println);
		
		System.out.println("--------find by sill and location---------");
		service.findBySkillLoc("html","chennai").forEach(System.out::println);
		
		System.out.println("--find by skill or location---");
		service.getBySkillOrLoc("html","chennai").forEach(System.out::println);
	}
	
   @Bean
   public Employee goutham() {
     return new Employee(102,"roshan",LocalDate.of(2000,8,10),"chennai","python",9856214896l);
}
}