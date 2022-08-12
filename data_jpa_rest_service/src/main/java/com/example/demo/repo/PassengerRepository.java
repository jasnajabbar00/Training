package com.example.demo.repo;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Passenger;
import com.example.demo.entity.TripHistory;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger,Integer> {

	List<Passenger> findByPassengerName(String srchname);
	
	List<Passenger> findByTripHistoryTripDateTime(LocalDateTime srchDateTime);
}
