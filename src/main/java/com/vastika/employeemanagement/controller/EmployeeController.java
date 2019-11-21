package com.vastika.employeemanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.vastika.employeemanagement.model.Employee;
import com.vastika.employeemanagement.service.EmployeeService;

@Controller
public class EmployeeController {
	
	private final EmployeeService employeeService;
	
	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	@RequestMapping("/add_employee")
	public String getEmployeeForm() {
		return"createEmployee";
	}
	
	@RequestMapping(value="/save_employee", method =RequestMethod.POST)
	public String saveEmployeeInfo(@ModelAttribute Employee employee) {
		employeeService.saveEmployeInfo(employee);
		return "redirect:/list_employee";
	}
	
	@GetMapping("/list_employee")
	public String getAllEmpoyeeInfo(Model model) {
		model.addAttribute("employees", employeeService.getAllEmployeeInfo());
		return "listEmployee";
	}
	
	@GetMapping("/delete_employee")
	public String deleteEmployeeInfo(@RequestParam int id) {
		employeeService.delteEmployeInfo(id);
		return "redirect:/list_employee";
	}
	
	@GetMapping("/edit_employee")
	public String getEditEmployeeForm(@RequestParam int id, Model model) {
		model.addAttribute("employee", employeeService.getEmployeeInfoById(id));
		return "editEmployee";
	}
	@PostMapping("/update_employee")
	public String updateEmployeeInfo(@ModelAttribute Employee employee) {
		employeeService.saveEmployeInfo(employee);
		return "redirect:/list_employee";
	}
}
