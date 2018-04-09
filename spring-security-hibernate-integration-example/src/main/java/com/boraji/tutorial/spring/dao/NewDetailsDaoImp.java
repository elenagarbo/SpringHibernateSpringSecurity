package com.boraji.tutorial.spring.dao;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import com.boraji.tutorial.spring.model.New;

public class NewDetailsDaoImp implements NewDetailsDao {
	
	private static final Logger logger = LoggerFactory.getLogger(NewDetailsDaoImp.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public void addNew(New n) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(n);
		logger.info("New saved successfully, New Details="+n);
	}

	@Override
	public void updateNew(New n) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(n);
		logger.info("New updated successfully, New Details="+n);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<New> listNews() {
		Session session = this.sessionFactory.getCurrentSession();
		List<New> personsList = session.createQuery("from News").list();
		for(New n : personsList){
			logger.info("New List::"+n);
		}
		return personsList;
	}

	@Override
	public New getNewById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		New n = (New) session.load(New.class, new Integer(id));
		logger.info("New loaded successfully, New details="+n);
		return n;
	}

	@Override
	public void removeNew(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		New n = (New) session.load(New.class, new Integer(id));
		if(null != n){
			session.delete(n);
		}
		logger.info("New deleted successfully, new details="+n);
	}

}
