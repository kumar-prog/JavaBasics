package com.kumar.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.kumar.model.Student;

public class LaunchFirstApp 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		
		//Step 1:- Create the Configuration Object
		Configuration config=new Configuration();
		
	    
		//Step 2:- configure hibernate.cfg.xml file to Configuration Object
		config.configure();
		
		
		//Step 3:- Create SessionFactory Object
		SessionFactory sessionFactory = config.buildSessionFactory();
		
		
		
		
		//Step 4: Get the Session Object from Session Factory
		Session session = sessionFactory.openSession();
		
		//Step 5: Begin the Transaction within Session in order to insert the data
		Transaction transaction = session.beginTransaction();
		
		//In order to insert the data to student table we need to create the student object.
		Student student=new Student();

		// We are setting the values to the Database using set method
		
		
		student.setSid(1);
		student.setSname("Kumar");
		student.setScity("Nalgonda");
		
		//To save the above object we need to perform some opearation 
		// Step 6 Perform the Operation
		session.save(student);
		
		//Step 7 Preforming Transaction Operations
		transaction.commit();
		
		//Step 8 Close the session
		session.close();
		
		
		
	}

}
