package com.niit.dao;

import java.util.List;

import com.niit.model.Supplier;
import com.niit.model.Supplier;

public interface SupplierDAO
{
	public boolean saveOrUpdate(Supplier supplier);


	// delete category
	public boolean delete(int id);

	public Supplier get(int id);
}
