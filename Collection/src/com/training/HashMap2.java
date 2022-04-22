package com.training;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.training.model.Student;

public class HashMap2 {

	public static void main(String[] args) {
		
		Student ram=new Student(101,"anand",78);
		Student shyam=new Student(102,"basky",88);
		Student mukesh=new Student(103,"mukesh",78);
		
		HashMap<Integer,Student> map=new HashMap<>();
		map.put(900, ram);
		map.put(902,shyam);
		map.put(904,mukesh);
		
        	System.out.println(map.get(900));
		    System.out.println(map.get(902));
		    System.out.println(map.get(904));
		
		Set<Integer> keys= map.keySet();
		
		for(Integer key:keys)
		{
		System.out.println(map.get(keys));
		}
		
		Collection<Student> list= map.values();
		for(Student eachStudent:list)
		{
			System.out.println(eachStudent);
		}
		Set<Map.Entry<Integer,Student>> list2= map.entrySet();
		
		for(Map.Entry<Integer,Student> eachEntry:list2) {
			System.out.println(eachEntry.getKey());
			System.out.println(eachEntry.getValue());
			
		}
	}
}
