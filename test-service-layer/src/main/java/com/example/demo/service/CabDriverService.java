package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CabDriver;
import com.example.demo.repo.CabDriverRepository;

@Service
public class CabDriverService {
	
	@Autowired
	private CabDriverRepository repo;

	public CabDriverService(CabDriverRepository repo) {
		super();
		this.repo = repo;
	}
	
	public Optional<CabDriver> findById(int id){
		return repo.findById(id);
	}
	
	public List<CabDriver> findAll(){
		return repo.findAll();
	}
	
	public CabDriver findByDriverName(String name){
		return repo.findByDriverName(name);
	}
	
	public CabDriver save(CabDriver entity) {
		return repo.save(entity);
	}
	 
	public Optional<CabDriver> deleteById(int id){
		
		return repo.deleteById(id);
	}
}
