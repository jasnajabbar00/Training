package com.example.demo.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CabDriver;
import com.example.demo.service.CabDriverService;

@RestController
@RequestMapping(value="/api/v1/drivers")
@CrossOrigin(origins="*")
public class CabDriverController {

	@Autowired
	private CabDriverService service;
	
	@Value("${server.port}")
	private String port;
	
	@PostMapping
	public ResponseEntity<CabDriver> add(@RequestBody CabDriver entity){

	CabDriver driver = this.service.save(entity);

	return ResponseEntity.status(HttpStatus.CREATED).body(driver);

	}
	
	@GetMapping
	public List<CabDriver> findAll() {
		return this.service.findAll();
	}
	
	@GetMapping(path="/{id}")
	public CabDriver findById(@PathVariable("id")int id) {
	return this.service.findById(id).orElseThrow(() -> new RuntimeException("Element Not Found"));
	}
	@DeleteMapping(path="/{id}")
	public CabDriver deleteById(@PathVariable("id")int id) {
	return this.service.deleteById(id).orElseThrow(() -> new RuntimeException("Element Not Found"));
	}


	@GetMapping(path="/srch/{name}")
	public CabDriver findByName(@PathVariable("name") String name) {
		CabDriver found = this.service.findByDriverName(name);
		found.setLocation(found.getLocation()+":"+port);
		return found;
	}





}
