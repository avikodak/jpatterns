package com.avikodak.jpatterns.prototype.impl;

import com.avikodak.jpatterns.prototype.Shape;

public class Rectangle extends Shape{

	public Rectangle(){
		type = "Rectangle";
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing Rectangle");
	}

}
