package com.avikodak.jpatterns.decorator.impl;

import com.avikodak.jpatterns.decorator.Shape;

public class RedDecoratedShape implements Shape{

	private Shape shape;
	
	public RedDecoratedShape(Shape shape) {
		super();
		this.shape = shape;
	}

	public void draw() {
		System.out.println("Drawing shape with red border");
		shape.draw();
		drawRedBorder();
	}
	
	private void drawRedBorder(){
		System.out.println("Drawing red color");
	}
}
