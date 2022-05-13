package com.example.demo.utils;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Seminar;
import com.example.demo.entity.Speaker;
import com.example.demo.repository.SeminarRepository;

@Component
public class SeminarUtils {

	
	@Autowired
	Seminar sem;
	
	@Autowired
	SeminarRepository repo;
	
	@Autowired
	Speaker speaker;
	
	public void create() {
		
		sem.setSpeaker(speaker);
		Seminar added=repo.save(sem);
		
		if(added!=null)
			System.out.println("One record added");
	}
}
