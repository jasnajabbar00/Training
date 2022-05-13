package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepository;

@Service
public class EmployeeService {

	private EmployeeRepository repo;
	
@Autowired
	public EmployeeService(EmployeeRepository repo) {
		super();
		this.repo = repo;
	}
	public Employee add(Employee entity) {
		return this.repo.save(entity);
	}
	
    public List<Employee> findAll() {
	   return this.repo.findAll();
	  }
    public List<Employee> findByDateOfBirth(LocalDate date){
    	return this.repo.findByDateOfBirth(date);
    }
    public List<Employee> fingByLocation(String location){
    	return this.repo.findByLocation(location);
    }
    public List<Employee> findBySkillSet(String skillset){
    	return this.repo.findBySkillSet(skillset);
    	 }
    public List<Employee> findBySkillLoc(String skillset,String location){
    	return this.repo.findBySkillLoc(skillset, location);
    }
    public List<Employee> getBySkillOrLoc(String skillset,String location){
    	return this.repo.findBySkillSetOrLocation(skillset, location);
    }
}