package com.jbk.criteriaclasses;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@SuppressWarnings("deprecation")
public class InsertQuery {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		SessionFactory sf = ConfigurationClass.getSessionFactoryRef();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		Query query = session.createSQLQuery("insert into Student(id,name,address) values(:id, :name, :address)");
		query.setParameter("id", 8);
		query.setParameter("name", "Amar");
		query.setParameter("address", "Nandurbar");
		int i = query.executeUpdate();
		tx.commit();
		if (i > 0) {
			System.out.println("Record Inserted Successfully..!");
		}

	}

}
