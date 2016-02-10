package com.avikodak.jpatterns.prototype.impl;

import com.avikodak.jpatterns.prototype.Shape;

public class Circle extends Shape{

	public Circle(){
		type = "Circle";
	}
	
	@Override
	public void draw() {
		System.out.println("Circle");
	}
	
}
