package com.avikodak.jpatterns.decorator.impl;

import com.avikodak.jpatterns.decorator.Shape;

public class Circle implements Shape{

	public void draw() {
		System.out.println("Drawing circle");
	}
	
}
