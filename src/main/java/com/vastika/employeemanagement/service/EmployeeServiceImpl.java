package com.vastika.employeemanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vastika.employeemanagement.model.Employee;
import com.vastika.employeemanagement.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	
	private final EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public void saveEmployeInfo(Employee employee) {
		employeeRepository.saveEmployeInfo(employee);
		
	}

	@Override
	public void updateEmployeInfo(Employee employee) {
		employeeRepository.updateEmployeInfo(employee);
		
	}

	@Override
	public void delteEmployeInfo(int id) {
		employeeRepository.delteEmployeInfo(id);
		
	}

	@Override
	public Employee getEmployeeInfoById(int id) {
		return employeeRepository.getEmployeeInfoById(id);
	}

	@Override
	public List<Employee> getAllEmployeeInfo() {
		return employeeRepository.getAllEmployeeInfo();
	}

}
