package com.vastika.employeemanagement.repository;

import java.util.List;

import com.vastika.employeemanagement.model.Employee;

public interface EmployeeRepository {
	
	void saveEmployeInfo(Employee employee);
	
	void updateEmployeInfo(Employee employee);
	
	void delteEmployeInfo(int id);
	
	Employee getEmployeeInfoById(int id);
	
	List<Employee> getAllEmployeeInfo();
	
}
