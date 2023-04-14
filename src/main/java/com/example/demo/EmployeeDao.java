package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepository empRepo;

	public Employ postEmp(Employ e) {
		return empRepo.save(e);
		
	}

	public Employ getEmp(int id) {

		return empRepo.findById(id).get();
	}

	public String addEmployees(List<Employ> emps) {
		// TODO Auto-generated method stub
		empRepo.saveAll(emps);
		return "Successfully saved";
	}

	public List<Employ> getEmployees() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}

	public String updateEmp(Employ id) {
		
		empRepo.save(id);
		return "Updated";
	}

	public String removeEmp(int id) {
		
		empRepo.deleteById(id);
		return "deleted";
	}
	

}
