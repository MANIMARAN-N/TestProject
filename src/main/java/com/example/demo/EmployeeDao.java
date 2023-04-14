package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepository empRepo;

	public Employee postEmp(Employee e) {
		return empRepo.save(e);
		
	}

	public Employee getEmp(int id) {

		return empRepo.findById(id).get();
	}

	public String addEmployees(List<Employee> emps) {
		// TODO Auto-generated method stub
		empRepo.saveAll(emps);
		return "Successfully saved";
	}

	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}

	public String updateEmp(Employee id) {
		
		empRepo.save(id);
		return "Updated";
	}

	public String removeEmp(int id) {
		
		empRepo.deleteById(id);
		return "deleted";
	}
	

}
