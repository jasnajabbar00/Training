package com.example.demo.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Driver;
import com.example.demo.repo.DriverRepository;

@Service
public class DriverService {

	@Autowired
	private DriverRepository repo;
	
    public List<Driver> findAll() {
    	
    return this.repo.findAll();
    }
    public Driver add(Driver entity) {
    	return this.repo.save(entity);
    }
    public Driver findById(int id) {
    	return this.repo.findById(id).orElseThrow( ()-> new RuntimeException(id+ "Not Found"));
    }
    public void remove(Driver entity) {
    	
    	boolean result=this.repo.existsById(entity.getDriverId());
    	
    	if(result) {
    		this.repo.delete(entity);
    	}else {
            throw new NoSuchElementException("Elemenet with Id=" + entity.getDriverId() + "Not Present");
    	}
    
    }
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		this.repo.deleteById(id);

	}
    public List<Driver> srchByDriverName(String name) {
    	return this.repo.findByDriverName(name);
    }

    public List<Driver> srchByMobileNumber(long number) {
    	return this.repo.findByMobileNumber(number);
    }
    public List<Driver> srchByDriverRating(double rating) {
    	return this.repo.searchByRating(rating);
    }
    public int updatedRating(int id,double updatedRating) {
    	return this.repo.modifyRating(id, updatedRating);
    }
    public List<Driver> sortedList(String propName) {
    	return this.repo.findAll(Sort.by(propName));
    }
}

