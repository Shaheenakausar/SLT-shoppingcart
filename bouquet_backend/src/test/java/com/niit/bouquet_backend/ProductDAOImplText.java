package com.niit.bouquet_backend;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.ProductDAO;
import com.niit.model.Product;

public class ProductDAOImplText {
	@Autowired
	 static AnnotationConfigApplicationContext context;
	
	@Autowired
	static ProductDAO productDAO;
	@Autowired
	static Product product;
	
	@BeforeClass
     
	public static void initialize()
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		
		context.refresh();
		
		productDAO=(ProductDAO)context.getBean("productDAO");
		
		product=(Product)context.getBean("product");
	}
	@Test
	public void createProductTestCase()
	{
		product.setId(2);
		product.setProductName("Flowers");
		product.setDescription("hi");
		product.setPrice(100);
		boolean flag=productDAO.saveOrUpdate(product);
		assertEquals("createProductTestCase", true, flag);
	}
	@Test
	public void deleteProductTestCase()
	{
		product.setId(1);
		boolean flag=productDAO.delete(1);
		assertEquals("deleteProductTestCase", true, flag);
	}

}
