package com.example.demo;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao dao;

	public Employ postEmp(Employ e) {

		return dao.postEmp(e);
	}

	public Employ getEmp(int id) {
		// TODO Auto-generated method stub
		return dao.getEmp(id);
	}

	public String addEmployees(List<Employ> emps) {
		// TODO Auto-generated method stub
		return dao.addEmployees(emps);
	}

	public List<Employ> getEmployees() {
		// TODO Auto-generated method stub
		return dao.getEmployees(); 
	}

	public List<Employ> getFemaleEmployee() {
		List<Employ> allEmp = dao.getEmployees();
		return allEmp.stream().filter(x->x.getGender().equalsIgnoreCase("female")).collect(Collectors.toList());
	}

	public List<Employ> getBySalary(int sal) {
		
		return dao.getEmployees().stream().filter(a->a.getSalary()>sal).toList();
	}

	public String updateEmp(Employ id) {
		
		return dao.updateEmp(id);
	}

	public String removeEmp(int id) {
		
		return dao.removeEmp(id);
	}

}
