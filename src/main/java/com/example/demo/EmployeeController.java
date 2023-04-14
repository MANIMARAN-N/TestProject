package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {
	@Autowired
	EmployeeService ser;

	@PostMapping(value = "/emp")
	public Employ postEmp(@RequestBody Employ e) {
		return ser.postEmp(e);
	}
	
	@PutMapping(value  = "/emp/{id}")
	public String updateEmp(@RequestBody Employ id) {
		return ser.updateEmp(id);
	
	}
	@DeleteMapping(value = "/emp/{id}")
	public String removeEmp(@PathVariable int id) {
		return ser.removeEmp(id);
	}
	@GetMapping(value = "/emp/{id}")
	public Employ getEmp(@PathVariable int id) {
		return ser.getEmp(id);
	}

//	@PostMapping(value = "/addList")
//	public String addEmployees(@RequestBody List<Employee> emps) {
//		return ser.addEmployees(emps);
//	}

	@GetMapping(value = "/emp")
	public List<Employ> getEmployees() {
		return ser.getEmployees();
	}
//	@GetMapping(value = "/getFemaleEmployee")
//	public List<Employee> getFemaleEmployee() {
//		return ser.getFemaleEmployee();
////	}
//	@GetMapping(value = "/getBySalary/{sal}")
//	public List<Employee> getBySalary(@PathVariable int sal) {
//		return ser.getBySalary(sal);
//	}
}
