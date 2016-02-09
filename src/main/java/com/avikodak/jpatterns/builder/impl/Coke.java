package com.avikodak.jpatterns.builder.impl;

import com.avikodak.jpatterns.builder.ColdDrink;

public class Coke extends ColdDrink{

	public String name() {
		return "Coke";
	}

	public float price() {
		return 11.0f;
	}
	
}
