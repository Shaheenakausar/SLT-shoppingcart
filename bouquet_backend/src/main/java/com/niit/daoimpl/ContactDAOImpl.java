package com.niit.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.dao.ContactDAO;
import com.niit.model.Product;
import com.niit.model.Contact;

@Repository("contactDAO")
@Transactional
public class ContactDAOImpl implements ContactDAO
{
	
	private static Logger log=LoggerFactory.getLogger(ContactDAOImpl.class);
	 
	@Autowired
	private SessionFactory sessionFactory;

	// write user defined constructor with one parameter i.e., sessionFactory

	public ContactDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public boolean save(Contact contact) {
		log.debug("Starting of method save in ContactDAOImpl");
		try {
			sessionFactory.getCurrentSession().save(contact);
		} catch (Exception e) {
			
			e.printStackTrace();
			return false;
		}
		log.debug("Ending of method save in ContactDAOImpl");
		return true;
	}

	public boolean delete(int id) {
		log.debug("Starting of method delete in ContactDAOImpl");
		try {
			sessionFactory.getCurrentSession().delete(get(id));
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	log.debug("Ending of method delete in ContactDAOImpl");
	return true;
    }

	
	  
    public Contact get(int id)	{
    	return (Contact)   sessionFactory.getCurrentSession().get(Contact.class, id);
    }
	
	public List<Contact> list() {
		return  sessionFactory.getCurrentSession().createQuery("from Contact").list();
	}

	public Contact getContactById(int id) {
		return (Contact) sessionFactory.getCurrentSession().get(Contact.class, id);
		 		
	}

	
    
}