package com.avikodak.jpatterns.facade.impl;

import com.avikodak.jpatterns.facade.Shape;

public class Circle implements Shape{

	public void draw() {
		System.out.println("Drawing circle");
	}

}
