package com.niit.bouquet_backend;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.CategoryDAO;
import com.niit.model.Category;

public class CategoryDAOImplText {
	@Autowired
	 static AnnotationConfigApplicationContext context;
	
	@Autowired
	static CategoryDAO categoryDAO;
	@Autowired
	static Category category;
	
	@BeforeClass
     
	public static void initialize()
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		
		context.refresh();
		
		categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
		
		category=(Category)context.getBean("category");
	}
	@Test
	public void createCategoryTestCase()
	{
		category.setId(4);
		category.setCategoryName("Flowers");
		category.setDescription("hi");
		boolean flag=categoryDAO.saveOrUpdate(category);
		assertEquals("createCategoryTestCase", true, flag);
	}
	@Test
	public void deleteCategoryTestCase()
	{
		category.setId(3);
		boolean flag=categoryDAO.delete(3);
		assertEquals("deleteCategoryTestCase", true, flag);
	}

}
