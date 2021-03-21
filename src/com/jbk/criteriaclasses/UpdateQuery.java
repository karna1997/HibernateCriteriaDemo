package com.jbk.criteriaclasses;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@SuppressWarnings({ "deprecation", "rawtypes" })
public class UpdateQuery {
	
	public static void main(String[] args) {

		SessionFactory sf = ConfigurationClass.getSessionFactoryRef();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("update Student set name=:name,address=:address where id=:id");
		query.setParameter("name", "yash");
		query.setParameter("address", "Dhule");
		query.setParameter("id", 2);
		int i = query.executeUpdate();
		tx.commit();
		if (i > 0) {
			System.out.println("Record updated Successfully..!!!");
		}
	}

}
