package com.training.training;
import java.util.HashMap;
import java.util.Set;

import com.training.Doctor;
import com.training.Patient;
public class Appoinment {
  
	private int tokenNumber;
    private HashMap<Doctor,Set<Patient>> lists;
	public Appoinment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Appoinment(int tokenNumber, HashMap<Doctor, Set<Patient>> lists) {
		super();
		this.tokenNumber = tokenNumber;
		this.lists = lists;
	}
	public int getTokenNumber() {
		return tokenNumber;
	}
	public void setTokenNumber(int tokenNumber) {
		this.tokenNumber = tokenNumber;
	}
	public HashMap<Doctor, Set<Patient>> getLists() {
		return lists;
	}
	public void setLists(HashMap<Doctor, Set<Patient>> lists) {
		this.lists = lists;
	}
	@Override
	public String toString() {
		return "Appoinment [tokenNumber=" + tokenNumber + ", lists=" + lists + "]";
	}
	public Set<Patient> getDetails(Doctor key)
	{
		return this.lists.get(key);
	}
}
