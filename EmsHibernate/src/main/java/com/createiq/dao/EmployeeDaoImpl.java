package com.createiq.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.createiq.ems.entity.Employee;
import com.createiq.ems.util.SessionUtil;

public class EmployeeDaoImpl implements EmployeeDAO{
     Session session=null;
	@Override
	public void save(Employee employee) {
		session=SessionUtil.getSession();
		session.save(employee); //saving employee obj through method parameter
		session.beginTransaction().commit();
		SessionUtil.closeConnection(session);
		System.out.println("successfully inserted");
	}

	@Override
	public void update(Employee employee) {
		session=SessionUtil.getSession();
		session.update(employee);
		session.beginTransaction().commit();
		SessionUtil.closeConnection(session);
		System.out.println("updated successfully");
	}

	@Override
	public void delete(int id) {
		session=SessionUtil.getSession();
		Employee emp=(Employee) session.get(Employee.class, id);
		session.delete(emp);
		session.beginTransaction().commit();
		SessionUtil.closeConnection(session);
		System.out.println("dlted successfully");

	}

	

	@Override
	public List<Employee> findAll() {
		session=SessionUtil.getSession();
		Query query=session.createQuery("from Employee");
		List<Employee> listofEmps=query.list();
		SessionUtil.closeConnection(session);
		return listofEmps;
	}

	@Override
	public Employee findById(int id) {
		session=SessionUtil.getSession();
		Employee employ=(Employee) session.get(Employee.class, id);
		SessionUtil.closeConnection(session);
		return employ;
	}

}
