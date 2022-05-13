package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.HealthInsurance;
import com.example.demo.entity.LifeInsurance;
import com.example.demo.service.InsuranceService;

@SpringBootApplication
public class SingleProjectPerClassHierarchyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SingleProjectPerClassHierarchyApplication.class, args);

         InsuranceService service=ctx.getBean(InsuranceService.class);
		
		System.out.println("-----------------");
		service.addHealthPolicy();
		service.addLifePolicy();
		
	}
   @Bean
   public LifeInsurance life() {
	   
	   return new LifeInsurance(985635,"Diya",25,"it services");
   }
   @Bean
   public HealthInsurance health() {
	   
	   return new HealthInsurance(542107,"Ramesh",55,"Diabetic");
   }
   

	}


