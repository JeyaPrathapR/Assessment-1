package org.hbn;

import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.cfg.Configuration;

import org.hbn.Students;

import org.hibernate.*;

public class Dao {

	public static void main(String[] args) {
	
		/*		creation and insertion
		Students stu = new Students();
		stu.setName("Jeyaprathap");
		stu.setPer(85.00);		
		*/
		
		Configuration con = new Configuration();
		con.configure();

		SessionFactory sf = con.buildSessionFactory();
		Session ses = sf.openSession();
		org.hibernate.Transaction tr = ses.beginTransaction();
		
		/*  Update
		Students stu = (Students)ses.get(Students.class, 2);
		stu.setName("Jeyaprathap");
		stu.setPer(100.00);
		
	
		ses.update(stu);*/
		
		/*
		Students stu = (Students)ses.get(Students.class, 2);
		ses.delete(stu);
		*/
		
		Query query = ses.createQuery("FROM Students e"); // display all the data from table
		
		List<Students> st = query.list();

		//Traversing through for-each
		
		for(Students str:st)
		{
			System.out.println(str);
		}
		
		//Iterator method
//		
//		Iterator<Employee> it = employees.iterator();
//		
//		 while(it.hasNext()) {
//		      System.out.println(it.next());
//		    }
		
		
		
		//ses.save(stu); creation
		//tr.commit();
		
	}
	
}
