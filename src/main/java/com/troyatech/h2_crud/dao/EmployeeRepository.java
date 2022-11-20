package com.troyatech.h2_crud.dao;

import com.troyatech.h2_crud.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	List<Employee> findByDept(String dept);

}
