package com.niit.dao;

import java.util.List;

import com.niit.model.Contact;


public interface ContactDAO
{
	public boolean save(Contact contact);


	// delete category
	public boolean delete(int id);
    
	public List<Contact> list();
	
	//get contact details based on contactIds
	public Contact getContactById(int id);
}
