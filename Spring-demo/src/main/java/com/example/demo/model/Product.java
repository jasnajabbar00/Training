package com.example.demo.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
@Data
//for make as private
@FieldDefaults(level = AccessLevel.PRIVATE)

//consturctor,getter setter,equals,hashcode,tostring,equals
@AllArgsConstructor//for all argument
@NoArgsConstructor//for no argument
public class Product {
	int id;
	String productName;

}


