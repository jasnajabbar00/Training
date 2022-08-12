package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import javax.persistence.EntityNotFoundException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.CabDriver;
import com.example.demo.service.CabDriverService;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
class TestServiceLayerApplicationTests {

	@Autowired
     CabDriverService service;
	
	@BeforeAll
	void setUp() {
		CabDriver driver= new CabDriver(1010,"ram",8745,"chennai",LocalDate.of(2000,10,05),4.6);
		
		service.save(driver);
	}
	
	@Test
	@DisplayName("Find All Method should return a Empty Array")
	void testFindAllFailure() {
		
		assertFalse(service.findAll().isEmpty());
	}
	@Test
	@DisplayName("Find All Method should return Array with Element")
	void testFindAllSucsess() {
		
		assertFalse(service.findAll().isEmpty());
	}
	@Test
	@DisplayName("Find By Id Method should return an Element with the given Id")
	void testFindById() {
		
		CabDriver driver=service.findById(1010).orElseThrow(EntityNotFoundException::new);
		
		assertEquals("ram", driver.getDriverName());
	}

}
