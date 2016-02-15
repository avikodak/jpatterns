package com.avikodak.jpatterns.facade.impl;

import com.avikodak.jpatterns.facade.Shape;

public class Square implements Shape{

	public void draw() {
		System.out.println("Drawing square");
	}

}
