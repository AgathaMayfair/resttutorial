package com.titos.resttutorial.repositories;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.titos.resttutorial.entities.User;

public class UserRepository {
	
	public User save(User user) {
		
		SessionFactory mySessionFactory = new Configuration().configure().addAnnotatedClass(User.class).buildSessionFactory();
		Session mySession = mySessionFactory.openSession();

		
		try {
			
			mySession.beginTransaction();
        	mySession.save(user);
        	mySession.getTransaction().commit();
        	mySession.close();
			
		} finally {
			
			mySessionFactory.close();
		}
		
		return null;
		
	}
	
	public User find(Integer id) {
		
		SessionFactory mySessionFactory = new Configuration().configure().addAnnotatedClass(User.class).buildSessionFactory();
		Session mySession = mySessionFactory.openSession();
		
		User user;
		
		try {
			
			mySession.beginTransaction();
			user = mySession.find(User.class, id);
			mySession.getTransaction().commit();
        	mySession.close();
        	
		} finally {
			
			mySessionFactory.close();
			
		}
		
		return user;
		
	}
	
	public List<User> findAll(){
		
		SessionFactory mySessionFactory = new Configuration().configure().addAnnotatedClass(User.class).buildSessionFactory();
		Session mySession = mySessionFactory.openSession();
		
		List<User> users;
		
		try {
			
			mySession.beginTransaction();
			users = mySession.createQuery("SELECT u FROM User u", User.class).getResultList();
			mySession.getTransaction().commit();
        	mySession.close();
        	
		} finally {
			
			mySessionFactory.close();
			
		}
		
		return users;
		
	}
	
	public User update(User user) {
		
		SessionFactory mySessionFactory = new Configuration().configure().addAnnotatedClass(User.class).buildSessionFactory();
		Session mySession = mySessionFactory.openSession();
		
		try {
			
			mySession.beginTransaction();
			mySession.saveOrUpdate(user);
			mySession.getTransaction().commit();
        	mySession.close();
        	
		} finally {
			
			mySessionFactory.close();
			
		}
		
		return null;
	}
	
	public void delete(User user) {
		
		SessionFactory mySessionFactory = new Configuration().configure().addAnnotatedClass(User.class).buildSessionFactory();
		Session mySession = mySessionFactory.openSession();
		
		try {
			
			mySession.beginTransaction();
			mySession.delete(user);
			mySession.getTransaction().commit();
        	mySession.close();
        	
		} finally {
			
			mySessionFactory.close();
			
		}
		
	}
	

}
