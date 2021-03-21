package com.jbk.criteriaclasses;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.jbk.entity.Student;

public class CriteriasListDemo {
	@SuppressWarnings({ "deprecation", "unchecked" })
	public static void main(String[] args) {
		SessionFactory sf = ConfigurationClass.getSessionFactoryRef();
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Student.class);
		List<Student> list = criteria.list();
		System.out.println("Student Detail's...!!!!");
		for (Student stud : list) {
			System.out.print(stud.getId() + " ");
			System.out.print(stud.getName() + " ");
			System.out.println(stud.getAddress() + " ");
		}

	}

}
