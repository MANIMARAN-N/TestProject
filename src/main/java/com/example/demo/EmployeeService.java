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

	public Employee postEmp(Employee e) {

		return dao.postEmp(e);
	}

	public Employee getEmp(int id) {
		// TODO Auto-generated method stub
		return dao.getEmp(id);
	}

	public String addEmployees(List<Employee> emps) {
		// TODO Auto-generated method stub
		return dao.addEmployees(emps);
	}

	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return dao.getEmployees(); 
	}

	public List<Employee> getFemaleEmployee() {
		List<Employee> allEmp = dao.getEmployees();
		return allEmp.stream().filter(x->x.getGender().equalsIgnoreCase("female")).collect(Collectors.toList());
	}

	public List<Employee> getBySalary(int sal) {
		
		return dao.getEmployees().stream().filter(a->a.getSalary()>sal).toList();
	}

	public String updateEmp(Employee id) {
		
		return dao.updateEmp(id);
	}

	public String removeEmp(int id) {
		
		return dao.removeEmp(id);
	}

}
