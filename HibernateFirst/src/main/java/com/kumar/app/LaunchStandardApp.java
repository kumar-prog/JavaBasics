package com.kumar.app;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.kumar.model.Student;

import org.hibernate.SessionFactory;

public class LaunchStandardApp 
{

	public static void main(String[] args) 
	{
		Configuration config=null;
		SessionFactory sessionFactory=null;
		Session session=null;
		Transaction transaction=null; 
		boolean flag= false;
		
		config = new Configuration();
		
		config.configure();
		
		sessionFactory=config.buildSessionFactory();
		
		session = sessionFactory.openSession();
		
		Student student= new Student();
		student.setSid(2);
		student.setSname("Bhavana");
		student.setScity("Halia");
		
		try 
		{
			transaction = session.beginTransaction();
			session.persist(student);
			flag=true;
		}
		catch(HibernateException e) 
		{
			e.printStackTrace();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
		finally 
		{
			if(flag==true)
			{
				transaction.commit();
			}
			else
			{
				transaction.rollback();
			}
			session.close();
			sessionFactory.close();
			
		}

	}

}
