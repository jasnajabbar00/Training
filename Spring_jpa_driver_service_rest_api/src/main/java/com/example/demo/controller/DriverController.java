package com.example.demo.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.entity.Driver;
import com.example.demo.service.DriverService;

@RestController
@RequestMapping(value="/api/v1")
public class DriverController {
	
	private DriverService service;
	
	@Autowired
	public DriverController(DriverService service) {
		super();
		this.service=service;
	}
	
    @GetMapping(path="/drivers")
    public List<Driver> getAllDrivers() {
    	return this.service.findAll();
    }
    
    @GetMapping(path="/drivers/srch/phone/{mobileNumber}")
    public List<Driver> getDriverByMobileNumber(@PathVariable("mobileNumber")long number) {
    	return this.service.srchByMobileNumber(number);
    }
    @GetMapping(path="/drivers/{id}")
    public Driver getDriverById(@PathVariable("id")int id) {
    	return this.service.findById(id);
    }
    @GetMapping(path="/drivers/srch/rating/{rating}")
    public List<Driver> getDriverByRating(@PathVariable("rating")double rating) {
    	return this.service.srchByDriverRating(rating);
    }
    @GetMapping(path="/drivers/srch/drivername/{name}")
    public List<Driver> getDriverByName(@PathVariable("name")String name) {
    	return this.service.srchByDriverName(name);
    }

    @PutMapping(path="/drivers/{id}/{rating}")
	public ResponseEntity<Integer> updateRating(@PathVariable("id")int id,@PathVariable("rating")double updatedRating) {
		int update=this.service.updatedRating(id, updatedRating);
		return ResponseEntity.ok().body(update);
	}

    
    @DeleteMapping(path="/drivers/{id}")  
    public ResponseEntity<String> deleteById(@PathVariable int id){
    	
    	this.service.deleteById(id);

    	return ResponseEntity.status(204).body("One Record Deleted "+id);
    	
    }

    @PostMapping(path="/drivers")
    public ResponseEntity<Driver> getDriver(@RequestBody Driver entity){
    	
    	Driver driver=this.service.add(entity);
    	
    	URI location=ServletUriComponentsBuilder
    			.fromCurrentRequest()
    			.path("/{id}")
    			.buildAndExpand(entity.getDriverId())
    			.toUri();
    	
    	return ResponseEntity.created(location).body(driver);
    }
    @GetMapping(path="/drivers/sort/{propName}")
    public List<Driver> sortByDriverName(@PathVariable("propName")String name){
    	return this.service.sortedList(name);
    }
}
