package com.niit.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.dao.AddressDAO;
import com.niit.model.Address;

@Repository("addressDAO")
@Transactional
public class AddressDAOImpl implements AddressDAO
{
	private static Logger log=LoggerFactory.getLogger(AddressDAOImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public AddressDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public boolean saveOrUpdate(Address address) {
		log.debug("Starting of method saveOrUpdate in AddressDAOImpl");
		
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(address);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		log.debug("Ending of method saveOrUpdate in AddressDAOImpl");
		return true;
	}

	public boolean delete(String id) {
		log.debug("Starting of method delete in AddressDAOImpl");
		try {
			sessionFactory.getCurrentSession().delete(getAddressById(id));
		}  catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		log.debug("Ending of method delete in AddressDAOImpl");
		return true;
	}

	public List<Address> list() {
		
		return sessionFactory.getCurrentSession().createQuery("from Address").list();
	}

	public Address getAddressById(String id) {
		 
		return (Address) sessionFactory.getCurrentSession().get(Address.class, id);
	}


	public Address getAddressByUserid(String userid) {
		return 	(Address)  sessionFactory.getCurrentSession().createQuery("from Address where user_id = ?").setString(0, userid).uniqueResult();

	}

	
}
