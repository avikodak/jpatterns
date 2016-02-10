package com.avikodak.jpatterns.factory;



import com.avikodak.jpatterns.constants.ShapeConstants;
import com.avikodak.jpatterns.factory.impl.Circle;
import com.avikodak.jpatterns.factory.impl.Rectangle;
import com.avikodak.jpatterns.factory.impl.Square;

public class ShapeFactory {
	
	public static Shape getShape(ShapeConstants shape){
		switch (shape) {
		case RECTANGLE:
			return new Rectangle();
		case SQUARE:
			return new Square();
		case CIRCLE:
			return new Circle();
		}
		return null;
	}
	
}
