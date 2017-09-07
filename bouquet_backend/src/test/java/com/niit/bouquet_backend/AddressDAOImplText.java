package com.niit.bouquet_backend;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.AddressDAO;
import com.niit.model.Address;

public class AddressDAOImplText {

	@Autowired
	static AnnotationConfigApplicationContext context;

	@Autowired
	static AddressDAO addressDAO;

	@Autowired
	static Address address;

	@BeforeClass
	public static void initialize() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();

		addressDAO = (AddressDAO) context.getBean("addressDAO");

		address = (Address) context.getBean("address");

	}

	@Test
	public void saveOrUpdateAddressTestCase() {
		address.setId("Shannu");
		address.setUserId("Shannu");
		address.setHouse_no("2-46-11");
		address.setStreet("Villa Vari Street, Venkat Nagar");
		address.setCity("Kakinada");
		address.setCountry("India");
		address.setPin("533003");

		boolean flag = addressDAO.saveOrUpdate(address);

		assertEquals("createAddressTestCase", true, flag);

	}

	@Test
	public void listAllAddressTestCase() {
		int actualSize = addressDAO.list().size();
		assertEquals(2, actualSize);
	}

}
