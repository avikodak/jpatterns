package com.avikodak.jpatterns.prototype.impl;

import com.avikodak.jpatterns.prototype.Shape;

public class Square extends Shape{
	
	public Square(){
		type = "Square";
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing Square");
	}

}
