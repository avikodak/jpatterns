package com.avikodak.jpatterns.nullobject.impl;

import com.avikodak.jpatterns.nullobject.AbstractCustomer;

public class NilCustomer extends AbstractCustomer {
	
	@Override
	public boolean isNil() {
		return true;
	}

	@Override
	public String getName() {
		return "Not Available in Customer Database";
	}
	
}
