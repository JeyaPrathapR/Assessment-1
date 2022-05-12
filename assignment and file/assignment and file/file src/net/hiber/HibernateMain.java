package net.hiber;

import java.util.*;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateMain {

	public static void insertQuery(Session session, org.hibernate.Transaction tr) {
		
		Scanner scan = new Scanner(System.in);
		
		String strSql = "From Students o";

		Query insertQuery = session.createQuery(strSql);	
		
			Students stud = new Students();
		
			System.out.println("Enter Rollno to Insert");
			
			int insertrollNo = scan.nextInt();
			stud.setRollNo(insertrollNo);
			
			System.out.println("Enter Name to Insert");
			
			String insertName = scan.next();
			stud.setStudentName(insertName);
			
			System.out.println("Enter DateofBirth");
			
			String insertDob = scan.next();			
			stud.setDateOfBirth(insertDob);
			
			System.out.println("Enter Address to Insert");
		
			String insertAddress = scan.next();
			stud.setAddressDetail(insertAddress);
			
			System.out.println("Enter department to Insert");
			
			String insertDept = scan.next();
			stud.setDept(insertDept);
			
			session.save(stud);
			System.out.println("wwwwwwwwwww");
			tr.commit();
			System.out.println("Successfully inserted");
			
	}
	
	
	public static void selectQuery(Session session) {
		
//		Query query = session.createQuery("FROM Students where id = "+selectId+"");// HQL
		
		Query query = session.createQuery("FROM Students e"); // display all the data from table
		
		List<Students> st = query.list();

		//Traversing through for-each
		
		for(Students str:st)
		{
			System.out.println(str);
		}
		
	}
	
	
	
	public static void updateQuery(Session session, org.hibernate.Transaction tr) {
		
		Query updateQuery = session.createQuery("update Students set student_name = :newName, address = :newAddress where roll_no = :num");
		updateQuery.setParameter("newName", "HariHaran");
		updateQuery.setParameter("newAddress", "THENI");
		updateQuery.setParameter("num", 99);
		
		int check = updateQuery.executeUpdate();
		System.out.println("------------"+check);
		tr.commit();
		
	}
	
	public static void deleteQuery(Session session, org.hibernate.Transaction tr, SessionFactory sessFact) {
		
//		Query deleteQuery =sessFact.getCurrentSession().createQuery("DELETE FROM Students WHERE roll_no = :num");
		Query deleteQuery = session.createQuery("DELETE FROM Students WHERE roll_no = :num");
		deleteQuery.setParameter("num", 22);

int row = deleteQuery.executeUpdate();

System.out.println("Deleted Row: " +row);

// if (row == 0)
//     System.out.println("Doesn't deleted any row!");
// else
//     System.out.println("Deleted Row: " +row);

 session.getTransaction().commit();
		
	}
	
	
	public static void main (String[] args) {
	
	SessionFactory sessFact = HibernateUtil.getSessionFactory();
	
	Session session = sessFact.getCurrentSession();
	
	org.hibernate.Transaction tr = session.beginTransaction();	
	
//	System.out.println("Insert the Query");
	
//	insertQuery(session, tr);
	
//	System.out.println("Fetch the Query");
//	
//	selectQuery(session);
//
//	System.out.println("Update Query");
//	
//	updateQuery(session, tr);
	
	System.out.println("Delete Query");
	
	deleteQuery(session, tr, sessFact);
	
	session.close();
	sessFact.close();
}
}



