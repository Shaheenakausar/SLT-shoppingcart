package com.niit.bouquet_backend;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.SupplierDAO;
import com.niit.model.Supplier;

public class SupplierDAOImplText {
	@Autowired
	 static AnnotationConfigApplicationContext context;
	
	@Autowired
	static SupplierDAO supplierDAO;
	@Autowired
	static Supplier supplier;
	
	@BeforeClass
     
	public static void initialize()
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		
		context.refresh();
		
		supplierDAO=(SupplierDAO)context.getBean("supplierDAO");
		
		supplier=(Supplier)context.getBean("supplier");
	}
	@Test
	public void createSupplierTestCase()
	{
		supplier.setId(3);
		supplier.setName("Flowers");
		supplier.setDescription("hi");
		
		boolean flag=supplierDAO.saveOrUpdate(supplier);
		assertEquals("createSupplierTestCase", true, flag);
	}
}
