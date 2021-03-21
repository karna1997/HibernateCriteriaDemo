package com.jbk.criteriaclasses;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jbk.entity.Student;

public class ConfigurationClass {
	private static SessionFactory sf = null;

	public static SessionFactory getSessionFactoryRef() {
		Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(Student.class);
		sf = cfg.buildSessionFactory();
		return sf;

	}

}
