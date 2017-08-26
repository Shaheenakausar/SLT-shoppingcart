package com.niit.dao;

import java.util.List;

import com.niit.model.Category;


public interface CategoryDAO
{
	public boolean saveOrUpdate(Category category);


	// delete category
	public boolean delete(int id);

	public Category get(int id);
}
