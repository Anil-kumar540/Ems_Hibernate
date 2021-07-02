package com.createiq.ems.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionUtil {
	public static SessionFactory sessionFactory;
 
	private static SessionFactory buildSessionFactory() {
	 try {	
		// Create the SessionFactory from hibernate.cfg.xml
			Configuration configuration = new Configuration();
			configuration.configure("com/createiq/ems/config/hibernate.cfg.xml");
			System.out.println("Hibernate Configuration loaded");
			SessionFactory sessionFactory = configuration.buildSessionFactory();
		return sessionFactory;
	 }catch (Throwable ex) {
			System.out.println("Initial SessionFactory creation failed." + ex);
			ex.printStackTrace();
			throw new ExceptionInInitializerError(ex);
		}	
	}
	public static Session getSession() {
		if(sessionFactory==null) {
			sessionFactory=buildSessionFactory();//calling buildsessionfactory method	
		}
		return sessionFactory.openSession();
	}
	public static void closeConnection(Session session) {
		if (session != null) {
			session.close();
		}
	}
 
	public static void main(String[] args) {
		//System.out.println(getSession());
	}	
}
