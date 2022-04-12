package com.training;
import java.util.*;

import com.training.model.Student;

public class HashMapApplication {

	public static void main(String[] args) {
		
		Student ram=new Student(101,"anand",78);
		Student shyam=new Student(102,"basky",88);
		Student dora=new Student(103,"dora",78);
		
		HashMap<Integer,Student> map=new HashMap<>();//declaration-HashMap
		
		System.out.println(map.put(900,ram));
		System.out.println(map.put(902,shyam));
		//System.out.println(map.put(902,dora));
		Student added=map.put(902, dora);
		
		if(added!=null) {
			map.put(904,added);
		}
		System.out.println(map.get(902));
		System.out.println(map.get(904));
	}
}
