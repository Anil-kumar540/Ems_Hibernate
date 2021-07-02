package com.createiq.dao;

import java.util.List;

import com.createiq.ems.entity.Employee;

public interface EmployeeDAO {
	void save(Employee employee);
	void update(Employee employee);
	void delete(int id);
	Employee findById(int id);
	List<Employee> findAll();

}
