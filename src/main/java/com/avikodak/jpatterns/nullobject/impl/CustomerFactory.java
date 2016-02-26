package com.avikodak.jpatterns.nullobject.impl;

import com.avikodak.jpatterns.nullobject.AbstractCustomer;

public class CustomerFactory {

	String[] customers = { "John", "Mary", "Abdul" };

	public AbstractCustomer getCustomer(String name) {
		for (String customer : customers) {
			if (customer.equalsIgnoreCase(name)) {
				return new RealCustomer(name);
			}
		}
		return new NilCustomer();
	}

}
