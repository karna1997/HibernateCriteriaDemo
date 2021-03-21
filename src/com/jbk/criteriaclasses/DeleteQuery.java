package com.jbk.criteriaclasses;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@SuppressWarnings("deprecation")
public class DeleteQuery {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		SessionFactory sf= ConfigurationClass.getSessionFactoryRef();
		Session session= sf.openSession();
		Transaction tx=session.beginTransaction();
		Query query=session.createQuery("Delete from Student where id=:id");
		query.setParameter("id", 8);
	int i=	query.executeUpdate();
		tx.commit();
		if(i>0){
			System.out.println("Record Deleted Successfully..!!!!!");
		}
	}

}
