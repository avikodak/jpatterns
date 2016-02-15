package com.avikodak.jpatterns.decorator.impl;

import com.avikodak.jpatterns.decorator.Shape;

public class Square implements Shape{

	public void draw() {
		System.out.println("Drawing square");
	}

}
