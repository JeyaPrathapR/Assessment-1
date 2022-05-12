package net.hiber;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static final SessionFactory sessionFactory;
	
	 
	
	 static {
	 try {
		 			
			  Configuration cfg = new Configuration().configure("Hibernate.cfg.xml");
			  StandardServiceRegistryBuilder sb = new StandardServiceRegistryBuilder();
			  sb.applySettings(cfg.getProperties()); 
			  StandardServiceRegistry standardserviceregistry = sb.build(); 
			   sessionFactory = cfg.buildSessionFactory(standardserviceregistry);
			  
		
	 }catch (Throwable th) {
		 System.err.println(th);
	  throw new ExceptionInInitializerError(th);
	 }
		
		 
	
	}
 
	public static SessionFactory getSessionFactory() {
		
		System.out.println("getSessionFactory");
		 return sessionFactory;
		
	}
 }
	
	

