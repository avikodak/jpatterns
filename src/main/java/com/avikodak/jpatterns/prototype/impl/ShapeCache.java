package com.avikodak.jpatterns.prototype.impl;

import java.util.HashMap;
import java.util.Map;

import com.avikodak.jpatterns.constants.ShapeConstants;
import com.avikodak.jpatterns.prototype.Shape;

public class ShapeCache {
	
	private Map<ShapeConstants, Shape> shapeCache = new HashMap<ShapeConstants, Shape>();
	
	public Shape getShape(ShapeConstants shape) throws CloneNotSupportedException{
		if(shapeCache.size() == 0){
			loadCache();
		}
		return (Shape)shapeCache.get(shape).clone();
	}
	
	private void loadCache(){
		Circle circle = new Circle();
		circle.setId("1");
		Rectangle rectangle = new Rectangle();
		rectangle.setId("2");
		Square square = new Square();
		square.setId("3");
		shapeCache.put(ShapeConstants.CIRCLE, circle);
		shapeCache.put(ShapeConstants.RECTANGLE, rectangle);
		shapeCache.put(ShapeConstants.SQUARE, square);
	}
}	
