package com.niit.bouquet_backend;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.OrderTableDAO;
import com.niit.model.OrderTable;

public class OrderTableDAOImplText {
	@Autowired
	static AnnotationConfigApplicationContext context;

	@Autowired
	static OrderTableDAO orderTableDAO;
	
	@Autowired
	static OrderTable orderTable;

	@BeforeClass

	public static void initialize() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");

		context.refresh();

		orderTableDAO = (OrderTableDAO) context.getBean("orderTableDAO");

		orderTable = (OrderTable) context.getBean("orderTable");
	}

	@Test
	public void createOrderTableTextCase() {
		orderTable.setId(1);
		orderTable.setUser_id("suveen");
		 orderTable.setStatus("N");
		boolean flag = orderTableDAO.save(orderTable);
		assertEquals("createOrderTableTestCase", true, flag);
	}

}
