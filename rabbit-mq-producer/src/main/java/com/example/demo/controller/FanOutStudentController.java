package com.example.demo.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Student;

@RestController
public class FanOutStudentController {
	
	@Autowired
	private RabbitTemplate template;
	
	@PostMapping(path="/fan/students")
	public String addStudent(@RequestBody Student entity) {

	template.convertAndSend("raj-sri-college","",entity);
	
	return "One Student Detail Sent";
    
	}
}
