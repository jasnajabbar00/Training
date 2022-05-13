package com.example.demo.model;

import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

//for make as private
@FieldDefaults(level = AccessLevel.PRIVATE)

//consturctor,getter setter,equals,hashcode,tostring,equals
@Data

@AllArgsConstructor//for all argument
@NoArgsConstructor//for no argument

@Component(value="stella")
public class Teacher {
	//for class level
	int id;
	String name;
	String subject;

}