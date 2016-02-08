package com.avikodak.jpatterns.factory.impl;

import com.avikodak.jpatterns.factory.Shape;

public final class Circle implements Shape{

	public void draw() {
		System.out.println("Drawing Circle");
	}

}
