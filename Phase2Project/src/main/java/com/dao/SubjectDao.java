package com.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Student;
import com.bean.Subject;


public class SubjectDao {

	public int storeSubject(Subject t)
	{
		try {
			  Configuration con = new Configuration();
			  con.configure("hibernate.cfg.xml"); //load xml file
			  SessionFactory sf = con.buildSessionFactory(); //connection con
			  Session session = sf.openSession(); //statement or preparedstatement in jdbc
			  Transaction tran = session.getTransaction();
			  tran.begin();  
			  session.save(t);   //same as insert query
			  tran.commit();
			  return 1;
			  }
		         catch (Exception e) {
			   // TODO: handle exception
			   System.out.println(e);
			   return 0;
			  }
	}
	
	public List<Subject> findAllSubject()
	{
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		TypedQuery qry=session.createQuery("select p from Subject p");
		List<Subject> listOfSubject=qry.getResultList();
		return listOfSubject;
		
	}
	
}
