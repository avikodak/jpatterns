package com.avikodak.jpatterns.bridge.impl;

import com.avikodak.jpatterns.bridge.DrawAPI;
import com.avikodak.jpatterns.bridge.Shape;

public class Circle extends Shape{
	
	private int x;
	private int y;
	private int radius;

	public Circle(DrawAPI drawAPI, int x, int y, int radius) {
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public void draw() {
		drawAPI.drawCircle(x, y, radius);
	}

}
