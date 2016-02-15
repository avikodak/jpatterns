package com.avikodak.jpatterns.decorator.impl;

import com.avikodak.jpatterns.decorator.Shape;

public class Rectangle implements Shape{

	public void draw() {
		System.out.println("Drawing rectangle");
	}

}
