package com.avikodak.jpatterns.decorator.impl;

import com.avikodak.jpatterns.decorator.Shape;

public class BlueDecoratedShape implements Shape{
	
	private Shape shape;

	public BlueDecoratedShape(Shape shape) {
		super();
		this.shape = shape;
	}

	public void draw() {
		System.out.println("Drawing shape with blue border");
		shape.draw();
		drawBlueBorder();
	}
	
	private void drawBlueBorder(){
		System.out.println("Drawing blue border");
	}
}
