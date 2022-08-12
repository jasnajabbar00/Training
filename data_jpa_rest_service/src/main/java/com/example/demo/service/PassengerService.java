package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Passenger;
import com.example.demo.entity.TripHistory;
import com.example.demo.repo.PassengerRepository;

@Service
public class PassengerService {

	private PassengerRepository repo;

	@Autowired
	public PassengerService(PassengerRepository repo) {
		super();
		this.repo = repo;
	}
	public List<Passenger> findAll() {
		return this.repo.findAll();
	}
   public Passenger add(Passenger entity) {
	   return this.repo.save(entity);
   }
   
	public List<Passenger> findByName(String name) {
		return this.repo.findByPassengerName(name);
	}
	public List<Passenger> findByDateTime(LocalDateTime dateTime) {
		return this.repo.findByTripHistoryTripDateTime(dateTime);
	}
}
