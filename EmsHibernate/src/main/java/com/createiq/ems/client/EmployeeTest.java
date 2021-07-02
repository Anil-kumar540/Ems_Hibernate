package com.createiq.ems.client;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.createiq.dao.EmployeeDaoImpl;
import com.createiq.ems.entity.Employee;

public class EmployeeTest {
	
	public static void main(String[] args) {
	
//	Configuration configuration=new Configuration().configure("com/createiq/ems/config/hibernate.cfg.xml");
//	SessionFactory sfFactory=configuration.buildSessionFactory();
//	Session session=sfFactory.openSession();
//	Employee emp1=new Employee("chaitu", 45000.00, "chaitu@gamil.com");
//	session.save(emp1);
////	Employee employee = (Employee) session.get(Employee.class, 1);
////    System.out.println(employee);
//	System.out.println(emp1);
////	session.getTransaction().commit();
//	session.beginTransaction().commit();
//	System.out.println("transaction success");
//	session.close();
//	System.out.println(session.isConnected());
	
		
		EmployeeDaoImpl dao=new EmployeeDaoImpl();
//--------------------------------		
		//Employee emp=new Employee("karthik", 35000.00, "karthik@gamil.com");
		//dao.save(emp);
//-------------------------------------------		
//		Employee employ=new Employee();
//		employ.setEid(5);
//		employ.setEname("harish");
//		employ.setEsal(35000.00);
//		employ.setEmail("harish@gmail.com");
//		dao.update(employ);
//--------------------------------------------	
		//dao.delete(6);
//--------------------------------------------		
//	List<Employee>	empList=dao.findAll();
//		for (Employee emps :empList ) {
//			System.out.println(emps);
//		}
//---------------------------------------
		System.out.println(dao.findById(2));
		
}
}