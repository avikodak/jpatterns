package com.avikodak.jpatterns.builder.impl;

import com.avikodak.jpatterns.builder.ColdDrink;

public class Pepsi extends ColdDrink{

	public String name() {
		return "Pepsi";
	}

	public float price() {
		return 10.0f;
	}

}
