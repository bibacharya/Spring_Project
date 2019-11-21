package com.vastika.employeemanagement.repository;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vastika.employeemanagement.model.Employee;
import com.vastika.employeemanagement.util.HibernateUtil;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {
	
	private final SessionFactory sessionFactory;
	
	@Autowired
	public EmployeeRepositoryImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void saveEmployeInfo(Employee employee) {
		HibernateUtil.getSession(sessionFactory).save(employee);
	}

	@Override
	public void updateEmployeInfo(Employee employee) {
		HibernateUtil.getSession(sessionFactory).update(employee);
		
		
	}

	@Override
	public void delteEmployeInfo(int id) {
		Employee employee = getEmployeeInfoById(id);
		if(employee !=null) {
			HibernateUtil.getSession(sessionFactory).delete(employee);
		}
		
		
	}

	@Override
	public Employee getEmployeeInfoById(int id) {
		
		return  (Employee) HibernateUtil.getSession(sessionFactory).get(Employee.class, id);
	}

	@Override
	public List<Employee> getAllEmployeeInfo() {
		Session session = HibernateUtil.getSession(sessionFactory);
		Criteria criteria = session.createCriteria(Employee.class);
		return criteria.list();
	}

}
