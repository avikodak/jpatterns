package com.avikodak.jpatterns.builder.impl;

import com.avikodak.jpatterns.builder.Burger;

public class VegBurger extends Burger{

	public String name() {
		return "Veg Burger";
	}

	public float price() {
		return 2.2f;
	}

}
