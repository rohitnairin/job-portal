package com.rohit.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionFactory;

	static {
		try{
		sessionFactory = new Configuration().configure().buildSessionFactory();
		System.out.println(sessionFactory == null);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
			
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void dispose() {
		sessionFactory.close();
	}

}
