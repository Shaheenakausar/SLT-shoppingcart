package com.niit.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.dao.CategoryDAO;
import com.niit.model.Category;
import com.niit.model.Product;

@Repository("categoryDAO")
@Transactional
public class CategoryDAOImpl implements CategoryDAO
{
	
	private static Logger log=LoggerFactory.getLogger(CategoryDAOImpl.class);
	 
	@Autowired
	private SessionFactory sessionFactory;

	// write user defined constructor with one parameter i.e., sessionFactory

	public CategoryDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public boolean saveOrUpdate(Category category) {
		log.debug("Starting of method saveOrUpdate in CategoryDAOImpl");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(category);
		} catch (Exception e) {
			
			e.printStackTrace();
			return false;
		}
		log.debug("Ending of method saveOrUpdate in CategoryDAOImpl");
		return true;
	}

	public boolean delete(int id) {
		log.debug("Starting of method saveOrUpdate in CategoryDAOImpl");
		try {
			sessionFactory.getCurrentSession().delete(get(id));
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	log.debug("Ending of method saveOrUpdate in CategoryDAOImpl");
	return true;
    }

	public Category get(int id)	{
    	return (Category)   sessionFactory.getCurrentSession().get(Category.class, id);
    } 
	 
}