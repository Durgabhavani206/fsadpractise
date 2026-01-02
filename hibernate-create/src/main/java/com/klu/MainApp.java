package com.klu;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class MainApp {

	public static void main(String[] args) {
		//Load configuration & Create the SessionFactory
		SessionFactory factory=new Configuration()
				.configure().buildSessionFactory();
		
		//open session(session is nothing but opening connection)
		Session session=factory.openSession();
		
		//Begin Transaction
		Transaction tx=session.beginTransaction();
		
		//create the table/object
		Student s=new Student("Durgabhavani");
		
		//Save the data / object
		session.save(s);
		
		//commit
		tx.commit();
		
		//close the connection
		session.close();
		factory.close();
		
		System.out.println("student data inserted successfully");
		
		

	}

}
