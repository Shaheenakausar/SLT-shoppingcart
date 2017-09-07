package com.niit.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.dao.OrderTableDAO;
import com.niit.model.OrderTable;
import com.niit.model.OrderTable;

@Repository("orderTableDAO")
@Transactional
public class OrderTableDAOImpl implements OrderTableDAO {

	private static Logger log = LoggerFactory.getLogger(OrderTableDAOImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	// write user defined constructor with one parameter i.e., sessionFactory

	public OrderTableDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public boolean save(OrderTable orderTable) {
		log.debug("Starting of method save in OrderTableDAOImpl");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(orderTable);
		} catch (Exception e) {

			e.printStackTrace();
			return false;
		}
		log.debug("Ending of method save in OrderTableDAOImpl");
		return true;
	}

	public List<OrderTable> list(String userId) {

		return sessionFactory.getCurrentSession().createQuery("from OrderTable where user_id=?").setString(0, userId).list();
	}

}