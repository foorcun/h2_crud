package com.troyatech.h2_crud.controller;

import com.troyatech.h2_crud.dao.EmployeeRepository;
import com.troyatech.h2_crud.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeRepository repository;

	@PostMapping("/saveEmployee")
	public String saveEmployee(@RequestBody Employee employee) {
		repository.save(employee);
		return "Employee saved..";
	}

	@GetMapping("/getAllEmployees")
	public List<Employee> getAll() {
		return repository.findAll();
	}

	@GetMapping("/getEmployee/{dept}")
	public List<Employee> getEmployeesByDept(@PathVariable String dept) {
		return repository.findByDept(dept);
	}

}
