package com.example.demo;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Passenger;
import com.example.demo.entity.TripHistory;
import com.example.demo.repo.PassengerRepository;

@SpringBootApplication
public class DataJpaRestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataJpaRestServiceApplication.class, args);
	}
	@Bean
	public CommandLineRunner runner() {
		return new CommandLineRunner() {
			
			@Autowired
			PassengerRepository repo;
			@Override
			public void run(String... args) throws Exception {
				// TODO Auto-generated method stub
				
		
			  Passenger ram=new Passenger();
			  ram.setPassengerId(1001);
			  ram.setPassengerName("ram");
			  ram.setEmail("ram100@gmail.com");
			  ram.setLocation("Kochi");
			  List<TripHistory> list=Arrays.asList(new TripHistory(101,LocalDateTime.now(),"chennai","kochi",10000.0));
			  		
			  ram.setTripHistory(list);
			  repo.save(ram);
	}
		};
	}

}
