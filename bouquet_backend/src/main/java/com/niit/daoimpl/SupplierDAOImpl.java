package com.niit.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.dao.SupplierDAO;
import com.niit.model.Product;
import com.niit.model.Supplier;

@Repository("supplierDAO")
@Transactional
public class SupplierDAOImpl implements SupplierDAO
{
	
	private static Logger log=LoggerFactory.getLogger(SupplierDAOImpl.class);
	 
	@Autowired
	private SessionFactory sessionFactory;

	// write user defined constructor with one parameter i.e., sessionFactory

	public SupplierDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public boolean saveOrUpdate(Supplier supplier) {
		log.debug("Starting of method saveOrUpdate in SupplierDAOImpl");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(supplier);
		} catch (Exception e) {
			
			e.printStackTrace();
			return false;
		}
		log.debug("Ending of method saveOrUpdate in SupplierDAOImpl");
		return true;
	}

	public boolean delete(int id) {
		log.debug("Starting of method saveOrUpdate in SupplierDAOImpl");
		try {
			sessionFactory.getCurrentSession().delete(get(id));
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	log.debug("Ending of method saveOrUpdate in SupplierDAOImpl");
	return true;
    }

	
	  
    public Supplier get(int id)	{
    	return (Supplier)   sessionFactory.getCurrentSession().get(Supplier.class, id);
    }

	
    
}