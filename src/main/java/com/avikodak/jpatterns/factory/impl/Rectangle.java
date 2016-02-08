package com.avikodak.jpatterns.factory.impl;

import com.avikodak.jpatterns.factory.Shape;

public final class Rectangle implements Shape{

	public void draw() {
		System.out.println("Drawing rectangle");
	}
	
}
