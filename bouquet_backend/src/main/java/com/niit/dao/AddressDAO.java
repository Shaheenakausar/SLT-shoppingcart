package com.niit.dao;

import java.util.List;

import com.niit.model.Address;

public interface AddressDAO {

	public boolean saveOrUpdate(Address address);


	public List<Address> list();
	
	public boolean delete(String id);
	
	public Address getAddressById(String id);
	
	public Address getAddressByUserid(String userid);

}
