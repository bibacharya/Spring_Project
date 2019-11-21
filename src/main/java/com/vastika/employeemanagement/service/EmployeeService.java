package com.vastika.employeemanagement.service;

import java.util.List;

import com.vastika.employeemanagement.model.Employee;

public interface EmployeeService {
	
	void saveEmployeInfo(Employee employee);
	
	void updateEmployeInfo(Employee employee);
	
	void delteEmployeInfo(int id);
	
	Employee getEmployeeInfoById(int id);
	
	List<Employee> getAllEmployeeInfo();

}
