package com.avikodak.jpatterns.builder.impl;

import com.avikodak.jpatterns.builder.Burger;

public class ChickenBurger extends Burger{

	public String name() {
		return "Chicken Burger";
	}

	public float price() {
		return 5.0f;
	}

}
