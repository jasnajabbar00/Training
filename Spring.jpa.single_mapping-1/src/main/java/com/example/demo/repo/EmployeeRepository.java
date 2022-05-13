package com.example.demo.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	
	public List<Employee> findByDateOfBirth(LocalDate date);
	
	public List<Employee> findByLocation(String location);
	
	public List<Employee> findBySkillSet(String skillset);
	
	public List<Employee> findBySkillSetOrLocation(String skillset,String location);
	
@Query(nativeQuery=true,value="select employee_Id,employee_name,date_of_birth,location,skill_set,phone_number from jasna_employee where skill_set=:skillset and location=:location")
public List<Employee> findBySkillLoc(@Param("skillset")String killset,@Param("location")String location);


}
