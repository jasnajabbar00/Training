package com.example.demo.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Passenger;
import com.example.demo.entity.TripHistory;
import com.example.demo.service.PassengerService;

@RestController
@RequestMapping(value="/api/v1")
public class PassengerController {

	private PassengerService service;

	@Autowired
	public PassengerController(PassengerService service) {
		super();
		this.service = service;
	}
	@GetMapping(path="/passengers")
	public List<Passenger> getpassenger(){
		return this.service.findAll();
		
	}
	
	  @GetMapping(path="/passengers/srch/passengername/{name}")
	    public List<Passenger> getPassengerByName(@PathVariable("name")String name) {
	    	return this.service.findByName(name);
	    }	
	  @GetMapping(path="/triphistory/srch/tripdatetime/{tripdate}")
	    public List<Passenger> getTripDate(@PathVariable("tripdate")@DateTimeFormat(iso=ISO.DATE_TIME)LocalDateTime dateTime) {
	    	return this.service.findByDateTime(dateTime);
	    }	
	
}
