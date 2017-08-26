package com.niit.bouquet_backend;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.ContactDAO;
import com.niit.model.Contact;

public class ContactDAOImplText {
	@Autowired
	 static AnnotationConfigApplicationContext context;
	
	@Autowired
	static ContactDAO contactDAO;
	@Autowired
	static Contact contact;
	
	@BeforeClass
     
	public static void initialize()
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		
		context.refresh();
		
		contactDAO=(ContactDAO)context.getBean("contactDAO");
		
		contact=(Contact)context.getBean("contact");
	}
	@Test
	public void createContactTestCase()
	{
		contact.setId(8);
		contact.setName("Flowers");
		contact.setEmail("lala@gmail.com");
		contact.setContact(789645123);
		contact.setMessage("welcome");
		
		boolean flag=contactDAO.save(contact);
		assertEquals("createContactTestCase", true, flag);
	}
	@Test
	public void deleteContactTestCase()
	{
		contact.setId(2);
		boolean flag=contactDAO.delete(2);
		assertEquals("deleteContactTestCase", true, flag);
	}
	@Test
	public void listContactTestCase()
	{
		int actualSize = contactDAO.list().size();
	}
}
