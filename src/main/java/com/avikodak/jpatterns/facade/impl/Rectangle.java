package com.avikodak.jpatterns.facade.impl;

import com.avikodak.jpatterns.facade.Shape;

public class Rectangle implements Shape{

	public void draw() {
		System.out.println("Drawing rectangle");
	}

}
